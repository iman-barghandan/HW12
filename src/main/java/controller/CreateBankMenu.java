package controller;

import scanner.ScannerClass;
import services.BankBranchService;

public class CreateBankMenu {
    public static void show() {
        System.out.println("BankBrach-Name: ");
        String bankBranchName = ScannerClass.getString();

        BankBranchService bankBranchService = new BankBranchService();
        bankBranchService.createBankBranch(bankBranchName);
    }
}
