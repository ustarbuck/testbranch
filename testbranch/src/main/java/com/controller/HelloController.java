package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller //일반 자바가 아니라 컨트롤러라고 등록을 해야 한다.- DispatcherServlet 이랑 연결한다.
public class HelloController {
	
//	//@RequestMapping(value="/hello.do", method=RequestMethod.GET)//value에 url(패키지명을 제외) 쓰면 된다. / method - POST인지 GET인지 알려준다
//	@GetMapping("/hello.do") //줄여서 쓴것 - 위에서도 value 안써도 된다.[post일떄는 @PostMapping]
//	public ModelAndView hello(){//콜백메소드 – 만든 건 사용자가 만들었는데 스프링이 자동으로 부른다.
//		ModelAndView mav = new ModelAndView(); // 데이터를 실어주는 것을 request라고 썼는데, 스프링에선 그 역할을 ModelAndView를 해준다.
//		mav.addObject("result", "Have a nice day"); //앞 : 변수명, 뒤 : 값 
//		//mav.setViewName("hello");// jsp의 파일명을 지정 - .jsp는 쓰면 안된다.  - *.jsp는 ViewResolver가 만들어준다.
//		// => /viwe/hello.jsp
//		mav.setViewName("/view/hello");//직접 기술하는 방법도 있다.
//		return mav;
//	}
	
	@GetMapping(value="/hello.do", produces="text/html;charset=UTF-8") //파일명을 안주면 자동으로 hello인 이름을 따라간다. 
	//Spring만의 특징 - 리턴 타입이 String이면 단순 문자열로 인식하는 것이 아니라 파일명으로 인식한다.
	//@ResponseBody를 사용하면 단순 문자열로 인식해라.
	public @ResponseBody String hello() {
		//hello.jsp가 없어서 그냥 브라우저에 뿌린다. - result의 영향을 못 미친다.
		return "안녕하세요";//글자로 찍으라고 했더니 파일명으로 인식했다. 파일 [/Have a nice day.jsp]을(를) 찾을 수 없습니다.
	}
	

	
}
