package spring_web_app.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/login")
	public String display(HttpServletRequest req, Model m) {
		// read the provided form data
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if (name.equals("kunal") && pass.equals("admin")) {
			String msg = "HELLO " + name+" Now ALL YOURS";
			// add a message to the model
			m.addAttribute("message", msg);
			return "viewPage";
		} else {
			String msg = "Sorry " + name + ". You entered an incorrect name or password";
			m.addAttribute("message", msg);
			return "errorPage";
		}
	}
	@RequestMapping("/")
	public String welcome()
	{
		return "index";
	}
	
	
	
}
