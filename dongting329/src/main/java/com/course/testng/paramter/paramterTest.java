package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramterTest {
    @Test
    @Parameters({"name","age"})
    public void paramyer(String name,int age){
        System.out.println("name=:"+name+" ; age="+age);
    }
}
