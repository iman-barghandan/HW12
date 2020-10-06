package services;

import domains.Account;
import domains.BankBranch;
import domains.CreditCard;
import domains.Customer;
import repositories.AccountRepositoryDAO;
import repositories.BankBranchRepositoryDAO;
import repositories.CreditCardRepositoryDAO;
import repositories.CustomerRepositoryDAO;

import java.util.Date;

public class AccountService {
    AccountRepositoryDAO accountRepositoryDAO= AccountRepositoryDAO.getInstance();
    CustomerRepositoryDAO customerRepositoryDAO = CustomerRepositoryDAO.getInstance();
    BankBranchRepositoryDAO bankBranchRepositoryDAO = BankBranchRepositoryDAO.getInstance();
    CreditCardRepositoryDAO creditCardRepositoryDAO = CreditCardRepositoryDAO.getInstance();

    public void createAccount(long customerId , long bankBranchId , long charge, String secondPassword )
    {
        Customer customer = customerRepositoryDAO.selectById(customerId);
        if (customer!=null)
        {
            Account account = new Account();
            account.setCustomer(customer);
            BankBranch bankBranch = bankBranchRepositoryDAO.selectById(bankBranchId);
            if (bankBranch!=null)
            {
                account.setBankBranch(bankBranch);
                account.setCreateAccountDate(new Date());

                CreditCard creditCard = new CreditCard();
                InformationCard informationCard = new InformationCard();
                String cardNumber = informationCard.getCardNumber();
                creditCard.setCardNumber(cardNumber);
                String cvv2 = informationCard.getCVV2();
                creditCard.setCvv2(cvv2);
                creditCard.setCharge(charge);
                String expirationDate = informationCard.ExpirationDate();
                creditCard.setExpirationDate(expirationDate);
                creditCard.setSecondPassword(secondPassword);
                creditCardRepositoryDAO.save(creditCard);

                account.setCreditCard(creditCard);
                accountRepositoryDAO.save(account);
            }

        }

    }
}
