package com.barath.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barath.app.entity.User;

/**
 * @author barath
 */
public interface UserRepository extends JpaRepository<User,String>{

    /** SELECT * FROM USER WHERER USER_NAME='barath' **/
    User findByUserName(String userName);


}
