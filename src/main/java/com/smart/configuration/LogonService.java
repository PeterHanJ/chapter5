package com.smart.configuration;

public class LogonService {
    private LoginDao loginDao;
    private UserDao userDao;

    public void sayHello(){
        System.out.println("Hello");
    }

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
