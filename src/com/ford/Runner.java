package com.ford;

import com.ford.controller.PEMService;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Welcome to My app : ");
        PEMService service  = new PEMService();
        service.showMenu();
    }
}
