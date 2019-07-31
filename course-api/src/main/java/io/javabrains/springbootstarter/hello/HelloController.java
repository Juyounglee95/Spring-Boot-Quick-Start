package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //this annotation marks this class is a Rest Controller
public class HelloController {
	
	@RequestMapping("/hello") // if user requests "URL/hello", this method will be called -> Request Mapping
	public String sayHi() {
		return "Hi";
	}
}
