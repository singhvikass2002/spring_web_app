package spring_web_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController3 {

	@RequestMapping("/")
	public String get() {
		System.out.println("Controller- fetchMapping");
		return "index";
	}

	
}
