package in.saffu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsgRestController {
	
	@GetMapping("/")
	public String greetMsg()
	{
		return "Good Morning";
	}

}
