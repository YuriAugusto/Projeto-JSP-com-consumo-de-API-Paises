package com.brq.internet.projetojspbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView exibiHomeJsp(ModelAndView model) {
		model.addObject("titulo", "Olá, Mundo!");
		model.setViewName("helloWorld");
		
		return model;
	}
}
