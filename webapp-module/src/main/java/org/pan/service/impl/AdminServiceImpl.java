package org.pan.service.impl;

import org.hibernate.Criteria;
import org.pan.domain.SystemUser;
import org.pan.service.AdminService;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by panmingzhi on 1/11/15.
 */
@Service("adminService")
public class AdminServiceImpl extends HibernateDaoSupport implements AdminService {

    @Override
    public boolean adminUserLogin(String username, String password) {
        return true;
    }

    @Override
    public SystemUser findSystemUserByUsername(String username) {
        return null;
    }

}
