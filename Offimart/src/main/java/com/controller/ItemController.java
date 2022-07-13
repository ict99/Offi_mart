package com.controller;

import org.springframework.validation.BindingResult;
import com.model.Item;
import com.service.ItemService;
import org.springframework.web.servlet.ModelAndView;

//use appropriate annotation to configure ItemController as Controller
public class ItemController {
	
//Use appropriate Annotation
	private ItemService itemService;
	
	    	 	

	//invoke the service class - calculateCostAndUpdate method.
	public ModelAndView calculateCostAndUpdate( Item item, BindingResult result,ModelAndView mv) {
		
		//fill the code
		return mv;
	}
//Use appropriate annotation to handle the exception
	public ModelAndView exceptionHandler(Exception e) {
		
		//fill the code
		return null;
	}
	
}
