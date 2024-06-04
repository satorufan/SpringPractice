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
	public String memberList(Model model) {
		logger.info("GET memberList - MemberController.");
		
		List<MemberDTO> memberList = dao.selectAll();
		model.addAttribute("memberList", memberList );
		
		return "member/list";
	}
	
	@RequestMapping(value = "/member/input.do", method = RequestMethod.GET)
	public String memberInput(Model model) {
		logger.info("GET memberInput - MemberController.");
		
		return "member/input";
	}
	
	@RequestMapping(value = "/member/input.do", method = RequestMethod.POST)
	public String memberInputOk(MemberDTO dto) {
		logger.info("POST memberInput - MemberController.");
		
		dao.insert(dto);
		
		return "redirect:list.do";
	}
	
	@RequestMapping(value = "/member/detail.do", method = RequestMethod.GET)
	public String memberDetail(MemberDTO dto, Model model) {
		logger.info("GET memberDetail - MemberController.");
		
		MemberDTO member = dao.findById(dto);
		model.addAttribute("member", member);
		
		return "member/detail";
	}
	
	@RequestMapping(value = "/member/edit.do", method = RequestMethod.GET)
	public String memberEdit(MemberDTO dto, Model model) {
		logger.info("GET memberEdit - MemberController.");

		MemberDTO member = dao.findById(dto);
		System.out.println(member);
		model.addAttribute("member", member);
		
		return "member/edit";
	}
	
	@RequestMapping(value = "/member/edit.do", method = RequestMethod.POST)
	public String memberEditOk(MemberDTO dto, Model model) {
		logger.info("POST memberEdit - MemberController.");
		
		System.out.println(dto);
		dao.update(dto);
		
		return "redirect:list.do";
	}
	
	@RequestMapping(value = "/member/delete.do", method = RequestMethod.GET)
	public String memberDelete(MemberDTO dto, Model model) {
		logger.info("GET memberDelete - MemberController.");
		
		dao.delete(dto);
		
		return "redirect:list.do";
	}
	
}
