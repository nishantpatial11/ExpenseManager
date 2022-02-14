package com.ford.bean;

import java.util.HashMap;
import java.util.Map;

public class Expense {
    private int category;
    private String item;
    private double amount;
    private String date;
    private static final HashMap<Integer,String> CATEGORIES_MAP = new HashMap<>(Map.of(1,"Personal",2,"Official"));
    public Expense(int category, String item, double amount, String date){
        this.category = category;
        this.item = item;
        this.amount= amount;
        this.date=date;
    }
    public String toString(){
        return CATEGORIES_MAP.get(this.category)+" => "+this.item +" : "+ this.amount+" : "+ this.date;
    }
}
