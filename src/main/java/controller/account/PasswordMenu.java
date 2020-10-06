package controller.account;

import scanner.ScannerClass;
import services.AccountService;
import services.CreditCardService;

public class PasswordMenu {
    public static void show(long customerId)
    {
        AccountService accountService = new AccountService();
        accountService.selectCreditCard(customerId);

        System.out.println("creditCard id: ");
        long creditCardId = ScannerClass.getNumber();

        System.out.println("new password: ");
        String newPassword = ScannerClass.getString();

        CreditCardService creditCardService = new CreditCardService();
        creditCardService.editSecondPasswordByCustomerId(customerId,creditCardId,newPassword);

    }
}
