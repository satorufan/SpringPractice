package com.comstudy.myweb.member;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberDAO dao;
	
	@RequestMapping(value = "/member/list.do", method = RequestMethod.GET)
	public String memberList(Locale locale, Model model) {
		logger.info("GET memberList - MemberController.", locale);
		
		List<MemberDTO> memberList = dao.selectAll();
		model.addAttribute("memberList", memberList );
		
		return "member/list";
	}
	
	@RequestMapping(value = "/member/input.do", method = RequestMethod.GET)
	public String memberInput(Locale locale, Model model) {
		logger.info("GET memberList - MemberController.", locale);
		
		model.addAttribute("member", new MemberDTO());
		
		return "member/input";
	}
	
	@RequestMapping(value = "/member/input.do", method = RequestMethod.POST)
	public String memberInputOk(@ModelAttribute("member") MemberDTO dto ) {
		logger.info("POST memberInput - MemberController.");
		
		System.out.println(dto);
		dao.insert(dto);
		
		return "redirect:list.do";
	}
	
	@RequestMapping(value = "/member/detail.do", method = RequestMethod.GET)
	public String memberDetail(Locale locale, Model model) {
		logger.info("GET memberList - MemberController.", locale);
		
		MemberDTO member = dao.findById(null);
		model.addAttribute("member", member);
		
		return "member/detail";
	}
	
	@RequestMapping(value = "/member/edit.do", method = RequestMethod.GET)
	public String memberEdit(Locale locale, Model model) {
		logger.info("GET memberList - MemberController.", locale);
		
		System.out.println(model);
		
		return "member/edit";
	}
	
	@RequestMapping(value = "/member/edit.do", method = RequestMethod.POST)
	public String memberEditOk(Locale locale, Model model) {
		logger.info("GET memberList - MemberController.", locale);
		
		dao.update(null);
		
		return "member/list";
	}
	
	@RequestMapping(value = "/member/delete.do", method = RequestMethod.GET)
	public String memberDelete(Locale locale, Model model) {
		logger.info("GET memberList - MemberController.", locale);
		
		dao.delete(null);
		
		return "redirect:list.do";
	}
	
}
