package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

    /**
     * @author yn2333
     * @Date 2020/03/03
     */

    @RestController
    @RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUserByid", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String GetUser(User user){
        return userService.Sel(user).toString();
    }

    @RequestMapping(value = "/add", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    public String Add(User user){
        return userService.Add(user);
    }

    @RequestMapping(value = "/update", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    public String Update(User user){
        return userService.Update(user);
    }

    @RequestMapping(value = "/delete", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    public String Delete(User user){
        return userService.Delete(user);
    }
}

