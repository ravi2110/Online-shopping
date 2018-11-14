package com.shopping.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);

		return mv;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);

		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);

		return mv;
	}

	/*
	 * @RequestMapping(value="/test") public ModelAndView
	 * test(@RequestParam(value="greeting",required=false)String greetings){
	 * if(greetings==null){ greetings=
	 * "Please, you must provide the greeting value"; } ModelAndView mv=new
	 * ModelAndView("page"); mv.addObject("greeting", greetings); return mv;
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/test1/{greeting}") public ModelAndView
	 * test1(@PathVariable(value="greeting")String greetings){
	 * if(greetings==null){ greetings=
	 * "Please, you must provide the greeting value"; } ModelAndView mv=new
	 * ModelAndView("page"); mv.addObject("greeting", greetings); return mv;
	 * 
	 * }
	 */
}
