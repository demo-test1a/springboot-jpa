package com.barath.app.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.barath.app.entity.User;
import com.barath.app.repository.UserRepository;

/**
 * @author barath
 */
@Service
public class UserService {

    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User createUser(User user) {
    	return this.userRepository.save(user);
    }

    public User getUserByUserName(String userName){      
        return this.userRepository.findByUserName(userName);
    }
    
    public List<User> getUsers(){
    	return this.userRepository.findAll();
    }


    @PostConstruct
    public void init(){
    	
    	Arrays.asList(new User(1L,"barath"))
    		.stream()
    		.forEach(this::createUser);
    	
        
    }

}
