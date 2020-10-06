package controller.account;

import scanner.ScannerClass;
import services.AccountService;
import services.CreditCardService;

public class CardToCardMenu2 {
    public static void show(long creditCardId) {

        System.out.println("second password: ");
        String secondPassword = ScannerClass.getString();

        System.out.println("cvv2: ");
        String cvv2 = ScannerClass.getString();

        System.out.println("expirationDate: ");
        String expirationDate = ScannerClass.getString();


        CreditCardService creditCardService = new CreditCardService();
        String result = creditCardService.checkingInformation2(creditCardId, secondPassword, cvv2, expirationDate);

        if (result.equals("ok"))
        {
            System.out.println("okkkkkkkkkk");
        }
        else System.out.println("mooooooooooooo");

    }
}
