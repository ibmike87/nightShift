package com.study.my.b_insert.mapper;

import java.util.List;

import com.study.my.b_insert.vo.GetStaff_VO;

public interface Main_Mapper {

	//사원 명단 가져오기
	public List<GetStaff_VO> getNames_SELECT();
	
}
