package com.ljc555.flashbuy.controller;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljc555.flashbuy.result.ResultDto;
import com.ljc555.flashbuy.util.ResultUtil;

@Controller
public class DemoController {

	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "Hello World";
	}
	
	@RequestMapping("result")
	@ResponseBody
	public ResultDto<String> Result() {
		return ResultUtil.Success("test result");
	}
	
	@RequestMapping("thymeleaf")
	public String thymeleaf(Model model) {
		model.addAttribute("name", "ljc555");
		return "hello";
	}
}
