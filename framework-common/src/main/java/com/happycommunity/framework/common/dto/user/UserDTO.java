package com.happycommunity.framework.common.dto.user;

import com.happycommunity.framework.common.dto.BaseDTO;

/**
 * @author Danny
 * @Title: UserDTO
 * @Description:
 * @Created on 2018-11-26 15:17:57
 */
public class UserDTO extends BaseDTO{
    private String userName;
    private String mobileNo;
    private String password;
    private String email;

    public String getUserName() {
        return userName;
    }

    public UserDTO setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public UserDTO setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }
}
