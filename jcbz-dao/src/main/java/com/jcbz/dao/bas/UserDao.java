package com.jcbz.dao.bas;

import com.jcbz.bean.entity.Tuser;
import org.springframework.stereotype.Repository;


/**
 * XXX
 *
 * @author fyc
 * @time 2018/1/4
 * @copyright Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Repository
public interface UserDao {
    Tuser selectUserById(Integer userId);
}
