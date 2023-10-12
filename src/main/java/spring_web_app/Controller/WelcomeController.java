package spring_web_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String message()
	{
		return "index";
	}
	@RequestMapping("/admin")
	public String adminDetails()
	{
		return "admin";
	}
}
