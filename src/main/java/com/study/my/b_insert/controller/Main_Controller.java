package com.study.my.b_insert.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.my.b_insert.service.Main_Service;
import com.study.my.b_insert.vo.GetStaff_VO;

/**
 * Handles requests for the application home page.
 */
@Controller
//@RequestMapping(value="/b_insert")
public class Main_Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Main_Controller.class);

	@Autowired 		//의존 자동 주입
	@Qualifier("Main_ServiceImple")		//사용할 의존 객체를 선택
	Main_Service service;
	
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
	}
*/

	/**
	 * 테스트 메인 페이지로 이동
	 */
	//@RequestMapping(value = "/testMain.do", method = {RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value = "/insertMain.do", method = RequestMethod.GET)
	public String testMain(Model model) {
		logger.info("입력 메인페이지 이동");
		
		String testMessage = "데이터 전송여부 확인";
		System.out.println(testMessage);
		model.addAttribute("data", testMessage);
		return "jsp/b_insert";
	}
	
	
	
	/**
	 *  사원 명단 가져오기
	 */
	//@RequestMapping(value = "/b_insert/getNames_select.do", method = RequestMethod.POST)
	@RequestMapping(value = "/getNames_select.do", method = RequestMethod.POST)
	public List<GetStaff_VO> getNames_SELECT() {
		logger.info(">> 사원 명단 가져오기 : Main_Controller");
		return service.getNames_SELECT(); 
	}
	
	
}
