package controller;

import scanner.ScannerClass;
import services.CustomerService;

public class SignInMenu {
    public static void show() {
        System.out.println("Username: ");
        String userName = ScannerClass.getString();

        System.out.println("Password: ");
        String password = ScannerClass.getString();

        CustomerService customerService = new CustomerService();
        long customerId = customerService.selectByUserNameAndPassword(userName, password);
        if (customerId != 0) {
            System.out.println("okkkkkkk");
            // TODO: 10/6/2020
        }
        else System.out.println("You did not register");

    }
}
