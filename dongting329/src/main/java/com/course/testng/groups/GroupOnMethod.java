package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @Test(groups = "server")
    public void test01(){
        System.out.println("这是服务端组的测试方法1");
    }
    @Test(groups = "server")
    public void test02(){
        System.out.println("这是服务端组的测试方法2");
    }
    @Test(groups = "client")
    public void test03(){
        System.out.println("这是客户端组的测试方法3");
    }
    @Test(groups = "client")
    public void test04(){
        System.out.println("这是客户端组的测试方法4");
    }
    @BeforeGroups("client")
    public void BeforeGroupsOnServer(){
        System.out.println("这是服务端运行之前运行的方法");
    }
    @AfterGroups("client")
    public void AfterGroups(){
        System.out.println("这是服务端运行之后运行的方法");
    }
}
