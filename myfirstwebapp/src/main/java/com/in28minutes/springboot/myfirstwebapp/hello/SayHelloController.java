package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	//"say-hello" => "Hello! What are you learning today?"
	
		//say-hello
		// http://localhost:8080/say-hello
//		@RequestMapping("say-hello")
//		@ResponseBody
//		public String sayHello() {
//			StringBuffer sb = new StringBuffer();
//			sb.append("<html>");
//			sb.append("<head>");
//			sb.append("<title> My First HTML Page - Changed</title>");
//			sb.append("</head>");
//			sb.append("<body>");
//			sb.append("My first html page with body - Changed");
//			sb.append("</body>");
//			sb.append("</html>");
//			
//			return sb.toString();
//		}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
