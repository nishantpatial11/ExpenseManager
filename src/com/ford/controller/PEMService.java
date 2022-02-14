package com.ford.controller;
import java.util.Scanner;


public class PEMService {
    Scanner sc = new Scanner(System.in);
    String input;
    ExpenseManager em = new ExpenseManager();

    public void showMenu(){
        while(true){
            printMenu();
            switch(input){
                case "A" -> em.addItems();
                case "D" -> em.displayItems();
                default -> System.out.println("Enter valid option");
            }
        }
    }

    public void printMenu(){
        System.out.println("******Menu******");
        System.out.println("A. Add");
        System.out.println("D.Display");
        System.out.println("*****************");
        System.out.println("Enter input or press * to exit");
        input = sc.next();
        if(input.equals("*"))
                System.exit(0);
    }



}
