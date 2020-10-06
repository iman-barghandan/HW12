package services;

import domains.Customer;
import repositories.CustomerRepositoryDAO;

import java.util.Date;

public class CustomerService {
    CustomerRepositoryDAO customerRepositoryDAO = CustomerRepositoryDAO.getInstance();

    public void signUpCustomer(String name ,String lastName,String username,String password ){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setLastName(lastName);
        customer.setUsername(username);
        customer.setPassword(password);
        customer.setRegister(new Date());
        customerRepositoryDAO.save(customer);
    }
}
