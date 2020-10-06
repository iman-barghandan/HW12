package controller.account;

import scanner.ScannerClass;
import services.CreditCardService;

public class CardToCardMenu2 {
    public static void show(long creditCardId, String originCard, String destinationCard, long chargeTransfer) {

        System.out.println("second password: ");
        String secondPassword = ScannerClass.getString();

        System.out.println("cvv2: ");
        String cvv2 = ScannerClass.getString();

        System.out.println("expirationDate: ");
        String expirationDate = ScannerClass.getString();


        CreditCardService creditCardService = new CreditCardService();
        String result = creditCardService.checkingInformation2(creditCardId, secondPassword, cvv2, expirationDate);

        if (result.equals("ok")) {
            System.out.println("changing...");
            creditCardService.editChangeCharge(originCard, destinationCard, chargeTransfer);
            System.out.println("transfer done!");
        } else System.out.println("information card is not valid");

    }
}
