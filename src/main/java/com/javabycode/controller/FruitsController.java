package com.javabycode.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fruits")
public class FruitsController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String[] fruits(HttpServletResponse response) {
		String[] fruits = { "Orange", "Apple", "Mango", "Banana", "Kiwi", "Cherry"};
		return fruits;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String[] fruitsWithPost(HttpServletResponse response) {
		String[] fruitsWithPost = { "Apricot", "Avocado", "Clementine", "Grape", "Guava", "Nectarine"};
		return fruitsWithPost;
	}
	
}
