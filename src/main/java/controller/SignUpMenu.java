package controller;

import scanner.ScannerClass;
import services.CustomerService;

public class SignUpMenu {

    public static void showMenu() {
        System.out.println("Name: ");
        String name = ScannerClass.getString();

        System.out.println("lastName: ");
        String lastName = ScannerClass.getString();

        System.out.println("Username: ");
        String username = ScannerClass.getString();

        System.out.println("Password: ");
        String password = ScannerClass.getString();

        CustomerService customerService = new CustomerService();
        customerService.signUpCustomer(name, lastName, username, password);
    }
}
