package com.learnings.threesixty.webservices;

import java.util.Date;
import java.util.List;

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
	
//	@GetMapping(path="/user/{id}")
//	public Optional<User> retriveUser(@PathVariable String id){
//		
//		Optional<User> optionalUser = userRepository.findById(id);
//		
//		return optionalUser;
//	} 
	@GetMapping(path="/user/{id}")
	public User retriveUser(@PathVariable String id){
		
		
		return new User("9","Ajit",new Date(),"male","arpit.jain@gmail.com");
	} 
	
//	@PostMapping(path="/saveuser")
//	public List<User> saveUser(@RequestBody User user){
//		userRepository.save(user);
//		
//		return userRepository.findAll();
//	} 

}
