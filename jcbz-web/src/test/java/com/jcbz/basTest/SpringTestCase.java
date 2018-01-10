package com.jcbz.basTest;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * XXX
 *
 * @author fyc
 * @time 2018/1/4
 * @copyright Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@ContextConfiguration(locations = {"classpath*:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class SpringTestCase extends AbstractJUnit4SpringContextTests{
    protected Logger logger = LoggerFactory.getLogger(getClass());
}
