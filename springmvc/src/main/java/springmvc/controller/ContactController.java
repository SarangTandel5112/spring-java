package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		// model.addAttribute("user", user);
		this.userService.createUser(user);

		System.out.println(user);

		return "success";
	}

	// @RequestMapping(path = "/processform", method = RequestMethod.POST)
	// public String handleForm(@RequestParam("email") String email,
	// @RequestParam("password") String password,
	// Model model) {

	// User user = new User();

	// user.setEmail(email);
	// user.setPassword(password);

	// model.addAttribute("user", user);

	// System.out.println(user);

	// return "success";
	// }

}
