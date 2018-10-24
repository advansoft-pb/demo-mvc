package pl.advansoft.master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/demo")
	public ModelAndView hello(@RequestParam String user) {
		ModelAndView mv = new ModelAndView("home");
		ModelMap modelMap = mv.getModelMap();
		modelMap.addAttribute("osoba", user);
		return mv;
	}
}
