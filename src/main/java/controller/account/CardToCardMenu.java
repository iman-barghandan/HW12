package controller.account;

import scanner.ScannerClass;
import services.AccountService;
import services.CreditCardService;

public class CardToCardMenu {
    public static void show(long customerId) {
        AccountService accountService = new AccountService();
        accountService.selectCreditCardInformation(customerId);

        System.out.println("Origin card: ");
        String originCard = ScannerClass.getString();

        System.out.println("Destination card: ");
        String destinationCard = ScannerClass.getString();

        System.out.println("Charge Transfer:");
        long chargeTransfer = ScannerClass.getNumber();

        CreditCardService creditCardService = new CreditCardService();
        long creditCardId = creditCardService.checkingInformation(customerId, originCard, destinationCard, chargeTransfer);
        if (creditCardId != 0) {
            CardToCardMenu2.show(creditCardId, originCard, destinationCard, chargeTransfer);
        } else System.out.println("information is not valid");

    }
}
