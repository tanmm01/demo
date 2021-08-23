package com.example.demo.add;

import com.example.demo.AAA;
import com.example.demo.reduce.Red;
import com.google.gson.Gson;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddTest {
    @Test
    public void case1(){
        Red red = new Red();
        System.out.println(red.red(3,2));
    }

    @Test
    public void case2(){
        Add add = new Add();
        add.add(1,2);
    }

    @Test
    public void case3(){
        AAA aaa = new AAA();
        aaa.setId(1);
        aaa.setName("jjjj");
        Gson gson = new Gson();
        System.out.println("========"+gson.toJson(aaa));
//        bbb(null);
    }
    
    @Test
    public void case4(){
        List<String> aa = new ArrayList<>();
        aa.add("1");
        aa.add("2");
        aa.add("3");


    	System.out.println("hello world");
    }

    public void bbb(AAA aaa){
        System.out.println("-------"+aaa.getName());
    }
}
