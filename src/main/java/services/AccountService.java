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
import java.util.List;

public class AccountService {
    AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();
    CustomerRepositoryDAO customerRepositoryDAO = CustomerRepositoryDAO.getInstance();
    BankBranchRepositoryDAO bankBranchRepositoryDAO = BankBranchRepositoryDAO.getInstance();
    CreditCardRepositoryDAO creditCardRepositoryDAO = CreditCardRepositoryDAO.getInstance();

    public void createAccount(long customerId, long bankBranchId, long charge, String secondPassword) {
        Customer customer = customerRepositoryDAO.selectById(customerId);
        if (customer != null) {
            Account account = new Account();
            account.setCustomer(customer);
            BankBranch bankBranch = bankBranchRepositoryDAO.selectById(bankBranchId);
            if (bankBranch != null) {
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


    public void selectAccountByCustomerId(long customerId) {
        List<Account> accountList = accountRepositoryDAO.selectAll();
        if (accountList.size() > 0) {
            for (Account item : accountList) {
                if (item.getCustomer().getId() == customerId) {
                    System.out.println("AccountId: " + item.getId());
                    System.out.println("BankBranchName: " + item.getBankBranch().getBankBranchName());
                    System.out.println("CreateAccountDate: " + item.getCreateAccountDate());
                    System.out.println("CardNumber: " + item.getCreditCard().getCardNumber());
                    System.out.println("Charge: " + item.getCreditCard().getCharge());
                    System.out.println("-----------");
                }
            }
        } else System.out.println("you have not account");
    }


    public void selectCreditCard(long customerId) {
        List<Account> accountList = accountRepositoryDAO.selectAll();
        if (accountList.size() > 0) {
            for (Account item : accountList) {
                if (item.getCustomer().getId() == customerId) {
                    System.out.println("AccountId: " + item.getId());
                    System.out.println("CreditCardId: " + item.getCreditCard().getId());
                    System.out.println("CardNumber: " + item.getCreditCard().getCardNumber());
                    System.out.println("SecondPassword: " + item.getCreditCard().getSecondPassword());
                    System.out.println("-----------");
                }
            }
        }
    }

    public void selectCreditCardInformation(long customerId) {
        List<Account> accountList = accountRepositoryDAO.selectAll();
        if (accountList.size() > 0) {
            for (Account item : accountList) {
                if (item.getCustomer().getId() == customerId) {

                    System.out.println("CreditCardId: " + item.getCreditCard().getId());
                    System.out.println("CardNumber: " + item.getCreditCard().getCardNumber());
                    System.out.println("CVV2: " + item.getCreditCard().getCvv2());
                    System.out.println("ExpirationDate: " + item.getCreditCard().getExpirationDate());
                    System.out.println("SecondPassword: " + item.getCreditCard().getSecondPassword());
                    System.out.println("Charge: " + item.getCreditCard().getCharge());
                    System.out.println("-----------");
                }
            }
        }


    }
}
