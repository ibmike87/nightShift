package com.study.my.b_insert.service;

import java.util.List;

import com.study.my.b_insert.vo.GetStaff_VO;

public interface Main_Service {
	
	//사원 명단 가져오기
	public List<GetStaff_VO> getNames_SELECT();
	
	
	
}
