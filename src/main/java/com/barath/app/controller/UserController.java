package com.barath.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barath.app.entity.User;
import com.barath.app.service.UserService;

/**
 * @author barath
 */
@RestController
public class UserController {

    
    private final UserService userService;

    public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/")
    public String home(){
        return "home";
    }

	@GetMapping("/user")
    public User findUserByName(@RequestParam("name") String userName){
        return  this.userService.getUserByUserName(userName);
    }
	
	@PostMapping("/user")
    public User createUser(@RequestBody User user){
        return  this.userService.createUser(user);
    }
	
	@GetMapping("/users")
    public List<User> findUsers(){
        return  this.userService.getUsers();
    }
}
