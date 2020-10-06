package controller.account;

import scanner.ScannerClass;
import services.AccountService;
import services.BankBranchService;

public class CreateAccountMenu {
    public static void show(long customerId) {
        BankBranchService bankBranchService = new BankBranchService();
        bankBranchService.selectBranchBanks();

        System.out.println("BankBranchId: ");
        long bankBranchId = ScannerClass.getNumber();

        System.out.println("Charge: ");
        long charge = ScannerClass.getNumber();

        System.out.println("Second Password: ");
        String secondPassword = ScannerClass.getString();

        AccountService accountService = new AccountService();
        accountService.createAccount(customerId, bankBranchId, charge, secondPassword);
    }
}
