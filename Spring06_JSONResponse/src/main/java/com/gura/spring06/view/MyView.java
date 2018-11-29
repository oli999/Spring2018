package com.gura.spring06.view;

import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

// bean 의 이름을 "fileDownView" 로 지정한다.
@Component("fileDownView")
public class MyView extends AbstractView{

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//ModelAndView 객체에 담았던 데이터가 Map 에 담겨서 전달된다. 
		int num=(int)model.get("num");
		String saveFileName=(String)model.get("saveFileName");
		
		//응답객체 (가상의 응답하기)
		PrintWriter pw=response.getWriter();
		pw.println("downloading...");
		pw.println("num:"+num);
		pw.println("saveFileName:"+saveFileName);
		pw.println("success!");
		pw.close();
	}

}












