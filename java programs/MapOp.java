
/*
Write a java program to segregate vegetables and fruits from a basket and tag prices as per current market value.
 
    Basket = {"FRT", "Apple"},{"VG", "Onion"},{"VG", "Potato"},{"VG", "Chillies"},{"FRT", "Mango"},{"FRT", "Banana"}
 
    Price/kg = {"200", "Apple"},
               {"20", "Onion"},
               {"20", "Potato"},
               {"80", "Chillies"},
               {"450", "Mango"},
               {"50", "Banana"}
               {"30", "Watermellon"},
               {"50", "Grapes"}               
			   
        Output <To be printed in below format> :
        Avaliable Fruits with price value :
        1. Apple 200/kg
        2. Mango 450/kg
        3. Banana 50/kg

        Avaliable Vegetables with price value :
        1. Onion 20/kg
        2. Potato 20/kg
        3. Chillies 80/kg 
	*/

package com.example.demo1.model;

import java.util.*;
import java.util.stream.Collectors;

public class MapOp {
    public static void main(String[] args) {

        Map<String,String> basket = new HashMap<>();

        basket.put("Apple","FRT");
        basket.put("Onion","VG");
        basket.put("Potato","VG");
        basket.put("Chillies","VG");
        basket.put("Mango","FRT");
        basket.put("Banana","FRT");

        Map<String,Integer> price = new HashMap<>();
        price.put("Apple",200);
        price.put("Onion",20);
        price.put("Potato",20);
        price.put("Chillies",80);
        price.put("Mango",450);
        price.put("Banana",50);
        price.put("Grapes",50);

        Set<Map.Entry<String, String>> entries = basket.entrySet();

        //System.out.println(entries);

        List<Map.Entry<String, String>> availableFruit = basket.entrySet()
                .stream().filter(s -> s.getValue() == "FRT")

                .collect(Collectors.toList());
        //System.out.println(availableFruit);
        List<Map.Entry<String, String>> availableVeg = basket.entrySet()
                .stream().filter(s -> s.getValue() == "VG")
                .collect(Collectors.toList());
        //System.out.println(availableVeg);
        int id = 0;
        System.out.println("Avaliable Fruits with price value : ");
        for(Map.Entry<String,String> e : availableFruit){
            id++;
            System.out.println(id + ". " +e.getKey() +" " + price.get(e.getKey())+"/kg");
        }

        System.out.println("Avaliable Vegetables with price value :");
        int index =0 ;
        for (Map.Entry<String,String> e:availableVeg){
            index++;
            System.out.println(index + ". " + e.getKey() + " " + price.get(e.getKey())+"/kg");
        }

    }
}
