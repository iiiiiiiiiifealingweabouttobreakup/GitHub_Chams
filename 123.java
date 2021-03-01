package pack.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/1")
	public String homeController() {
		return "loginPage";
	}
	@RequestMapping(value="/check", method = RequestMethod.POST)
	public String check(String ID, String PW, Model model) throws Exception {
		System.err.println(ID);
		System.err.println(PW);
		String msg =  (ID.equals("hello")&&PW.equals("world")) ? "succeed" : "failed";
		model.addAttribute("result", msg);
		return "result";
	}
}