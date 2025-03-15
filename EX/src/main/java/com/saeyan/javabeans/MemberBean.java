package com.saeyan.javabeans;

public class MemberBean {
	private String name;
	private String userid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", userid=" + userid + ", getName()=" + getName() + ", getUserid()="
				+ getUserid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public MemberBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberBean(String name, String userid) {
		super();
		this.name = name;
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
}
