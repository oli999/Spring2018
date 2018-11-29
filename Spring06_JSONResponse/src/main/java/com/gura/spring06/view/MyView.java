package com.gura.spring06.view;

import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;
/*
 *  [ 추상 view 객체를 이용해서 응답하는 방법 ]
 *  
 *  1. AbstractView 추상 클래스를 클래스를 상속받는다.
 *  2. 추상 메소드 오버라이딩해서 메소드 안에서 원하는 작업을 한다.
 *  3. 해당클래스에 @Component("bean 의 이름") 을 붙인다.
 *  4. servlet-context.xml 에서 component 스켄을 해야한다.
 *  5. servlet-context.xml 에 BeanNameViewResolver bean 을 정의한다.
 *  6. ModelAndView 객체에 .setViewName("bean 의 이름") 을 전달한다. 
 */
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












