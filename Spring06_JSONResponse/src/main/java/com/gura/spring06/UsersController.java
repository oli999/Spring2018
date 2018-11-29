package com.gura.spring06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
	
	@RequestMapping("/users/signup_form")
	public String signupForm() {
		// view 페이지로 forward 이동해서 회원가입 폼 응답하기 
		return "users/signup_form";
	}
}









