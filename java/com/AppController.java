package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class AppController {
	@Autowired
	MenuRepository menuRepository;
	
	
	@PostMapping("/upload")
	public Menu signUp(@RequestBody Menu menu) {
		Menu temp;
		try {
			temp = menuRepository.save(menu);
			return temp;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
