package com.shopping.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.shoppingbackend.dao.CategoryDao;
import com.shopping.shoppingbackend.dto.Category;

@Controller
public class PageController {
	 
	@Autowired	
	private CategoryDao categoryDao;	
    
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		/*passing list of categories*/
		mv.addObject("categories", categoryDao.list());
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
	
	/*Methods to load all the products and based on category*/
	
	@RequestMapping(value = { "/show/all/products" })
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDao.list());
		mv.addObject("userClickAllProducts", true);

		return mv;
	}
	
	@RequestMapping(value = { "/show/category/{id}/products" })
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category=null;
		category=categoryDao.get(id);
		mv.addObject("title",category.getName());
		
		// passing the list of categories
		mv.addObject("categories", categoryDao.list());
		
		//passing the single category object
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts", true);

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
