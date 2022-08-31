package com.oa.lxs.controller.login;

import com.oa.lxs.dao.MailDao.AoaInMailListDao;
import com.oa.lxs.service.Task.impl.AoaTaskUserServiceImpl;
import com.oa.lxs.service.UserService.AoaUserService;
import com.oa.lxs.service.UserService.impl.AoaNotepaperServiceImpl;
import com.oa.lxs.service.UserService.impl.AoaUserLoginRecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class loginController {
    @Autowired
    private AoaUserService aoaUserService;

    @Autowired
    private AoaUserLoginRecordServiceImpl aoaUserLoginRecordServiceImpl;

    @Autowired
    private AoaNotepaperServiceImpl aoaNotepaperServiceimpl;

    @Autowired
    private AoaTaskUserServiceImpl aoaTaskUserService;

    @Autowired
    private AoaInMailListDao aoaInMailListDao;

    @RequestMapping("/")
    public String login(){
        return "login/login";
    }

    @RequestMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response){

    }
}
