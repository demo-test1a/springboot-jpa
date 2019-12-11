package com.barath.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author barath
 */
@Entity
@Table(name="USER")
public class User implements Serializable {

	private static final long serialVersionUID = 6181090318795469814L;

	@Id
    @Column(name="USER_ID",length=50)
    private Long userId;

    @Column(name="USER_NAME",length=50)
    private String userName;



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User() {
    }
}
