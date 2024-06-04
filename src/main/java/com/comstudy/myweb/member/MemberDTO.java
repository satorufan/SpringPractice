package com.comstudy.myweb.member;

import java.util.Objects;

public class MemberDTO {

	private String id;
	private String password;
	private String name;
	private String role;
	
	public MemberDTO() {
		this("","","","");
	}

	public MemberDTO(String id, String password, String name, String role) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDTO other = (MemberDTO) obj;
		return Objects.equals(id, other.id);
	}

	
	
}
