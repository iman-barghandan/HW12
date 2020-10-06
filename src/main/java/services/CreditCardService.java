package services;

import domains.CreditCard;
import domains.Customer;
import repositories.CreditCardRepositoryDAO;
import repositories.CustomerRepositoryDAO;

public class CreditCardService {
    CustomerRepositoryDAO customerRepositoryDAO = CustomerRepositoryDAO.getInstance();
    CreditCardRepositoryDAO creditCardRepositoryDAO = CreditCardRepositoryDAO.getInstance();

    public void editSecondPasswordByCustomerId(long customerId , long creditCardId, String newPassword)
    {
        CreditCard creditCard = creditCardRepositoryDAO.selectById(creditCardId);
        if (creditCard!=null && creditCard.getAccount().getCustomer().getId()==customerId)
        {
            creditCard.setSecondPassword(newPassword);
            creditCardRepositoryDAO.update(creditCard);
            System.out.println("Done, your new password is : " + newPassword);
        }
        else System.out.println("this creditCard not exist");
    }

}
