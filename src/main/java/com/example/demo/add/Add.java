package com.example.demo.add;

import java.util.ArrayList;
import java.util.List;

public class Add {

    public int add(int a, int b){
        if(a > b){
            return 10;
        }else if(a == b){
            return 8;
        }else if(a < b){
            return 7;
        }else{
            return 9;
        }
    }

    public static void main(String[] args) {
        List<Long> tagIds = new ArrayList<>();
        tagIds.add(1L);
        tagIds.add(2L);
        tagIds.add(3L);
        String condition = "";
        condition = "tag_id in (";


        StringBuilder finalCondition = new StringBuilder(condition);
        tagIds.forEach(id -> finalCondition.append(id).append(","));
        condition = finalCondition.replace(finalCondition.length() - 1, finalCondition.length(), ")").toString();
        System.out.println("======" + condition);
    }
}
