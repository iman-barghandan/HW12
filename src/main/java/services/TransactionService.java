package services;

import domains.Account;
import domains.Transaction;
import repositories.AccountRepositoryDAO;
import repositories.TransactionRepositoryDAO;

import java.util.Date;
import java.util.List;

public class TransactionService {
    TransactionRepositoryDAO transactionRepositoryDAO = TransactionRepositoryDAO.getInstance();
    AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();


    public void selectTransaction(long customerId, long accountId, Date fromDate) {
        Account account = accountRepositoryDAO.selectById(accountId);
        if (account != null && account.getCustomer().getId() == customerId) {
            List<Transaction> transactions = account.getTransactionList();
            if (transactions.size() > 0) {
                for (Transaction item : transactions) {
                    if (item.getTransactionDate().after(fromDate)) {
                        System.out.println("Transaction Id: " + item.getId());
                        System.out.println("Transaction Date: " + item.getTransactionDate());
                        System.out.println("CreditCard Destination: " + item.getCreditCardDestination());
                        System.out.println("Cost: " + item.getCost());
                        System.out.println("------------");
                    }
                }
            } else System.out.println("this account have not transaction");
        }
    }
}
