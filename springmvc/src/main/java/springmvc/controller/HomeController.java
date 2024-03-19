package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Sarang Tandel");
		System.out.println("Home run");
		return "index";
	}

	@RequestMapping("/help")
	public ModelAndView help(Model model) {
		System.out.println("Help run");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Sat");
		modelAndView.addObject("address", "Valsad");

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		modelAndView.addObject("list", list);

		modelAndView.setViewName("help");

		return modelAndView;
	}

}
