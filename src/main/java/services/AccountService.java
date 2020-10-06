package services;

import domains.Account;
import domains.Customer;
import repositories.AccountRepositoryDAO;
import repositories.CustomerRepositoryDAO;

public class AccountService {
    AccountRepositoryDAO accountRepositoryDAO= AccountRepositoryDAO.getInstance();
    CustomerRepositoryDAO customerRepositoryDAO = CustomerRepositoryDAO.getInstance();

    public void createAccount(long customerId)
    {
        Customer customer = customerRepositoryDAO.selectById(customerId);
        if (customer!=null)
        {
            Account account = new Account();
            account.setCustomer(customer);
        }

    }
}
