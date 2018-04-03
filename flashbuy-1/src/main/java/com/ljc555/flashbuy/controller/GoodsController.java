package com.ljc555.flashbuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ljc555.flashbuy.domain.MiaoshaUser;
import com.ljc555.flashbuy.redis.RedisService;
import com.ljc555.flashbuy.service.MiaoshaUserService;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	MiaoshaUserService userService;
	
	@Autowired
	RedisService redisService;
	
    @RequestMapping("/to_list")
    public String list(Model model,MiaoshaUser user) {
    	model.addAttribute("user", user);
        return "goods_list";
    }
    
}
