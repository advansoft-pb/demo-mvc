package pl.advansoft.master.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/demo")
	public String hello(Model model, @RequestParam(required = false, defaultValue = "Użytkownik") String user) {
		model.addAttribute("osoba", user);

		Map<String, Object> map = model.asMap();
		System.out.println("size: " + map.size());

		return "home";
	}
}
