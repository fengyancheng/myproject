package com.jcbz.controller.bas;

import com.jcbz.bean.entity.Tuser;
import com.jcbz.service.bas.UserService;
import com.sun.org.apache.bcel.internal.generic.IUSHR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * XXX
 *
 * @author fyc
 * @time 2018/1/5
 * @copyright Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");
        Tuser user = userService.selectUserById(1);
        mav.addObject("user", user);
        return mav;
    }
}
