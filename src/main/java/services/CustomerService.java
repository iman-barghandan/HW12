package services;

import domains.Customer;
import repositories.CustomerRepositoryDAO;

import java.util.Date;
import java.util.List;

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

    public long selectByUserNameAndPassword(String userName, String password) {
        List<Customer> customerList = customerRepositoryDAO.selectAll();
        long id = 0L;
        if (customerList.size() > 0)
        {
            for (Customer item : customerList)
            {
                if (item.getUsername().equals(userName) && item.getPassword().equals(password))
                {
                    System.out.println("welcome");
                    id = item.getId();
                }
            }
        }
        return id;
    }
}
