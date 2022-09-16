package Palvelinohjelmointi.SpringTesti.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
	
	@RequestMapping("moikkaa")
	@ResponseBody
	public String sayHelloToUser(@RequestParam(name="nimesi", required=false, defaultValue="Nimetön") String nimi, 
			@RequestParam(name="ika", required=false, defaultValue = "0") int age) {
		
			if (age == 0) {
				return "Terppa " + nimi;
			}else {
		return "Terppa " + nimi + " " + age + " vuotta!";
		
	}
	
	}
}
