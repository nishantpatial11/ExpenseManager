package com.ford.controller;

import com.ford.bean.Expense;

import java.time.LocalDate;
import java.util.*;
public class ExpenseManager {


    //Created Arraylist
    private ArrayList<Expense> expenses = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void addItems(){
        System.out.print("Enter Category, Choose 1 for Personal and 2 for Official : ");
        int category = sc.nextInt();
        System.out.print("Enter item : ");
        String item = sc.next();
        System.out.print("enter amount : ");
        double amount = sc.nextDouble();
        System.out.print("enter date : ");
        String date = sc.next();
        if(date.equals("d")){
            date= String.valueOf(LocalDate.now());
        }
        Expense expense = new Expense(category,item,amount,date);
        expenses.add(expense);
    }
    public void displayItems(){
        for(int i=0;i<expenses.size();i++){
            if(expenses.get(i) != null){
                System.out.println(expenses.get(i));
            }
        }
    }
}
