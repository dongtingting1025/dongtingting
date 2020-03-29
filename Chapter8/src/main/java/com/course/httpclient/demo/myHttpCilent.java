package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class myHttpCilent {
    @Test
    public void test01() throws Exception {
        String result;//用来存放我们的结果
        HttpGet get=new HttpGet("http://www.baidu.com");//创建get方法
        HttpClient Client=new DefaultHttpClient();//这个是用来执行get方法
        HttpResponse response=Client.execute(get);
        result=EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }
}
