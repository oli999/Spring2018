package com.gura.spring06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
	
	@RequestMapping("/json08")
	@ResponseBody
	public List<MemberDto> json08(){
		List<MemberDto> list=new ArrayList<>();
		list.add(new MemberDto(1, "김구라", "노량진"));
		list.add(new MemberDto(2, "김구라2", "노량진2"));
		list.add(new MemberDto(3, "김구라3", "노량진3"));
		return list;
	}
	
	
	@RequestMapping("/json07")
	@ResponseBody
	public MemberDto json07() {
		MemberDto dto=new MemberDto(1, "김구라", "노량진");
		return dto;
	}
	
	@RequestMapping("/json06")
	@ResponseBody
	public List<Map<String, Object>> json06(){
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		
		List<Map<String, Object>> list=new ArrayList<>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		return list;
	}
	
	@RequestMapping("/json05")
	@ResponseBody
	public Map<String,List<String>> json05(){
		List<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		Map<String,List<String>> map=new HashMap<>();
		map.put("names", names);
		return map;
	}

	@RequestMapping("/json04")
	@ResponseBody
	public List<String> json04(){
		List<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		return names;
	}
	
	@RequestMapping("/json03")
	@ResponseBody
	public Map<String, Object> json03(){
		Map<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "gura");
		map.put("isMan", true);
		return map;
	}
	
	@RequestMapping("/json01")
	public String json01() {
		// /WEB-INF/views/json01.jsp 페이지로 forward 이동해서 
		// json 문자열 응답 
		return "json01";
	}
	
	@RequestMapping(value="/json02", method=RequestMethod.GET, 
			produces="application/json;charset=utf-8")
	@ResponseBody
	public Map<String, Object> json02() {
		Map<String, Object> map=new HashMap<>();
		map.put("num", 999);
		/*	 
		 * 	1. jackson 라이브러리가 dependency 에 명시 되어있고 
		 *  2. 위 메소드에 @ResponseBody 어노테이션이 붙어있고
		 *  3. servlet-context.xml 에 <annotation-driven/> 
		 *  이 설정되어있으면
		 *  
		 *  HashMap 객체에 담긴 정보가 아래의 json 형식의 문자열로 
		 *  클라이언트에게 응답된다. 
		 *
		 */
		return map;
	}
}







