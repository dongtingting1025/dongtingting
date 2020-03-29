package com.course.testng;

import org.testng.annotations.*;

public class BasicAnn {
    @Test//最基本的注解，用来把方法标记为测试的一部分
    public void test01(){
        System.out.println("这是测试用例1");
    }
    @Test//最基本的注解，用来把方法标记为测试的一部分
    public void test02(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod这是在测试方法之后远行的");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");//suite包含多个类class 在类运行之前执行
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
