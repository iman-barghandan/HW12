package controller.account;

import scanner.ScannerClass;

public class AccountMenu {
    public static void show(long customerId) {

        int selectedNumber;
        while (true) {
            System.out.println("(1) create account\n" +
                    "(2) show all account\n" +
                    "(3) edit credit card password\n" +
                    "(4) card to card\n" +
                    "(5) exit");
            selectedNumber = ScannerClass.getNumber(1, 5);

            if (selectedNumber == 1)
            {

            } else if (selectedNumber == 2) {


            } else if (selectedNumber == 3) {


            } else if (selectedNumber == 4) {


            } else{
                break;
            }
        }
    }
}
