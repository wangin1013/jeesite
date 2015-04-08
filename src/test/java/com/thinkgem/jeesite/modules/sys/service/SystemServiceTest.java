package com.thinkgem.jeesite.modules.sys.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class SystemServiceTest {

    @Test
    public void test() {
        String password = "admin";
        String result = SystemService.entryptPassword(password);
        
        System.out.println(result);
    }

}
