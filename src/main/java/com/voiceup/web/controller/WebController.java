package com.voiceup.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	
	@RequestMapping("/")
	public  ModelAndView index(HttpServletRequest request, HttpServletResponse response){
		ModelAndView index = new ModelAndView();
		
		index.setViewName("index");
		return index;
	}

}
