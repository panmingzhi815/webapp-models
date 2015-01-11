package org.pan.controller;

import org.pan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by panmingzhi on 1/11/15.
 */
@Controller()
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("")
    public String admin(){
        adminService.adminUserLogin("","");
        return "adminLoginPage";
    }

    @RequestMapping("/adminLoginPage")
    public String adminLoginPage(){
        return "adminLoginPage";
    }

    @RequestMapping("/adminManagePage")
    public String adminManagePage(){
        return "adminManagePage";
    }

    @RequestMapping("/adminLogin")
    public String adminLogin(@RequestParam("username") String username,@RequestParam("password") String password){
        return "adminManagePage";
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }
}
