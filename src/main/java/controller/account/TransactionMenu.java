package controller.account;

import scanner.ScannerClass;
import services.AccountService;
import services.TransactionService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionMenu {
    public static void show(long customerId)
    {
        AccountService accountService = new AccountService();
        accountService.selectAccountByCustomerId(customerId);

        System.out.println("account Id: ");
        long accountId = ScannerClass.getNumber();

        System.out.println("from date: (0000-00-00) ");
        String fromDate = ScannerClass.getString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = new Date(sdf.parse(fromDate).getTime());
            TransactionService transactionService = new TransactionService();
            transactionService.selectTransaction(customerId,accountId,date);

        } catch (ParseException e) {
            System.out.println("date is not valid");
        }

    }
}
