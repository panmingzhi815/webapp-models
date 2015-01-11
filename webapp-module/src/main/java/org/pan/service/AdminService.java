package org.pan.service;

import org.pan.domain.SystemUser;

/**
 * Created by panmingzhi on 1/11/15.
 */
public interface AdminService {

    public boolean adminUserLogin(String username,String password);

    public SystemUser findSystemUserByUsername(String username);
}
