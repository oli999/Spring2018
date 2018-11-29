package com.gura.spring06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersController {
	
	@RequestMapping("/users/signup_form")
	public String signupForm() {
		// view 페이지로 forward 이동해서 회원가입 폼 응답하기 
		return "users/signup_form";
	}
	@RequestMapping("/users/checkid")
	@ResponseBody
	public Map<String, Object> checkid(@RequestParam String inputId){
		Map<String, Object> map=new HashMap<>();
		if(inputId.equals("gura")) {
			map.put("canUse", false);
		}else {
			map.put("canUse", true);
		}
		return map;
	}
}

















