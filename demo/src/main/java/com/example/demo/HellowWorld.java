package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowWorld {
	
	@RequestMapping("/hellow")
	@ResponseBody
    public Map hellow() {
    	Map hello  = new HashMap();
    	hello.put("hello", "world");
    	return hello;
    }
}
