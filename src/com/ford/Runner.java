package com.ford;

import com.ford.controller.PEMService;

public class Runner {
    public static void main(String[] args) {
        PEMService service  = new PEMService();
        service.showMenu();
    }
}
