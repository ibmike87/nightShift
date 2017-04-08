package com.study.my.b_insert.service;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.study.my.b_insert.mapper.Main_Mapper;
import com.study.my.b_insert.vo.GetStaff_VO;

/**
 * Handles requests for the application home page.
 */
@Service("Main_ServiceImple")
public class Main_ServiceImple implements Main_Service{
	
	//private static final Logger logger = LoggerFactory.getLogger(Main_ServiceImple.class);
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	Main_Mapper mapper;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}*/
	

	/**
	 *  사원 명단 가져오기
	 */
	@Override
	public List<GetStaff_VO>  getNames_SELECT() {
		logger.info(">>사원 명단 가져오기 : Main_ServiceImple");
		return mapper.getNames_SELECT();
	}
	
	
}
