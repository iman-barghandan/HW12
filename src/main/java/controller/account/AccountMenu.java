package controller.account;

import scanner.ScannerClass;
import services.AccountService;

public class AccountMenu {
    public static void show(long customerId) {

        int selectedNumber;
        while (true) {
            System.out.println("(1) create account\n" +
                    "(2) show all account\n" +
                    "(3) edit credit card password\n" +
                    "(4) card to card\n" +
                    "(5) transactions\n" +
                    "(6) exit");
            selectedNumber = ScannerClass.getNumber(1, 6);

            if (selectedNumber == 1) {
                CreateAccountMenu.show(customerId);
            } else if (selectedNumber == 2) {
                AccountService accountService = new AccountService();
                accountService.selectAccountByCustomerId(customerId);
            } else if (selectedNumber == 3) {
                PasswordMenu.show(customerId);
            } else if (selectedNumber == 4) {
                CardToCardMenu.show(customerId);
            } else if (selectedNumber == 5) {
                TransactionMenu.show(customerId);
            } else {
                break;
            }
        }
    }
}
