package com.postbook;

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
	UserRepository userRepository;

	@Autowired
	PostRepository postRepository;

	@Autowired
	CommentRepository commentRepository;

	@PostMapping("/signin")
	public User signIn(@RequestBody User user) {
		User temp = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		return temp;
	}

	@PostMapping("/signup")
	public User signUp(@RequestBody User user) {
		User temp;
		try {
			temp = userRepository.save(user);
			return temp;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
