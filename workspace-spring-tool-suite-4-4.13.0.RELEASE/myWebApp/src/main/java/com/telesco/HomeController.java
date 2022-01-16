package com.telesco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import reactor.netty.http.server.HttpServerRequest;

@Controller
public class HomeController {

//	@RequestMapping("home")
//	//public String home(HttpServletRequest req) {
//	 //public String home(@RequestParam("name")  String name, HttpSession session) {
//		public ModelAndView home(@RequestParam("name")  String myname) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", myname);
//		mv.setViewName("home");
////		HttpSession session = req.getSession();
////		String name = req.getParameter("name");
//		//session.setAttribute("name", name);
//		//return "home";
//		return mv;
//	}
	
	   @RequestMapping("home")
		public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
	
	
}
