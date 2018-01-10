package com.jcbz.bas;

import com.jcbz.basTest.SpringTestCase;
import com.jcbz.bean.entity.Tuser;
import com.jcbz.service.bas.UserService;
import org.jboss.logging.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * XXX
 *
 * @author fyc
 * @time 2018/1/4
 * @copyright Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class UserServiceTest extends SpringTestCase{

    Logger logger = Logger.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void selectUserByIdTest(){
        Tuser user = userService.selectUserById(10);
        logger.debug("查找结果" + user);
    }

}
