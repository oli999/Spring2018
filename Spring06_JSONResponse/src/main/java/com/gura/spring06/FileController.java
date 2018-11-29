package com.gura.spring06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileController {
	
	@RequestMapping("/download")
	public ModelAndView download(@RequestParam int num) {
		//ModelAndView 객체를 생성해서 
		ModelAndView mView=new ModelAndView();
		//다운로드 시켜줄 파일의 정보를 담고 
		mView.addObject("num", num);
		mView.addObject("saveFileName", "kimgura.jpg");
		//다운로드 시켜줄 view 페이지의 정보를 담아서 
		mView.setViewName("fileDownView");
		//리턴해준다. 
		return mView;
	}
}














