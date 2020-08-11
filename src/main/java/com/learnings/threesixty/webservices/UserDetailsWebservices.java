package com.learnings.threesixty.webservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsWebservices {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/user/{id}")
	public Optional<User> retriveUser(@PathVariable String id){
		
		Optional<User> optionalUser = userRepository.findById(id);
		
		return optionalUser;
	} 
	
	@PostMapping(path="/saveuser")
	public List<User> saveUser(@RequestBody User user){
		userRepository.save(user);
		
		return userRepository.findAll();
	} 

}
