package com.krishna.Oauth2_security.authentication.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("krishna");
        al.add("shyam");
        al.add("santosh");
        al.add("amrin");
        al.add("ramraj");

        al.stream().filter(s -> !s.equalsIgnoreCase("santosh")).forEach(s -> System.out.println(s));

        Map<String, Employee> hm = new HashMap<String, Employee>();
        hm.put("a", new Employee(1,"Krishna"));
        hm.put("a", new Employee(2,"Yadav"));
        for(){

        }


    }
}
