package com.rose.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(HttpSession session) {
		
		if (session.getAttribute("count")==null) {
			
			session.setAttribute("count",0);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			session.setAttribute("count",currentCount+1);
		}
		
		
		return "counter.jsp";
	}
	
	@GetMapping("/counter/2")
	public String counter2(HttpSession session) {
		
		Integer currentCount = (Integer) session.getAttribute("count");
		session.setAttribute("count", currentCount+2);
		
		return "counter.jsp";
	}
	
	@GetMapping("/counter/reset")
	public String counterReset(HttpSession session) {
		
		session.setAttribute("count", 0);
		
		return "index.jsp";
	}
}
