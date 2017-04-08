package com.study.my;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	

	/**
	 * 테스트 메인 페이지로 이동
	 */
	//@RequestMapping(value = "/testMain.do", method = {RequestMethod.GET, RequestMethod.POST})
//	@RequestMapping(value = "/insertMain.do", method = RequestMethod.GET)
//	public String testMain(Model model) {
//		logger.info("입력 메인페이지 이동");
//		
//		String testMessage = "데이터 전송여부 확인";
//		System.out.println(testMessage);
//		model.addAttribute("data", testMessage);
//		return "jsp/b_insert";
//	}
	
	
}
