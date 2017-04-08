package com.study.my.b_insert.vo;

public class GetStaff_VO {
	private int num;
	private String name;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GetStaff [num=" + num + ", name=" + name + "]";
	}

}
