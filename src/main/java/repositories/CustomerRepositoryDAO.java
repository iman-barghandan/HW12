package repositories;

import domains.Customer;

public class CustomerRepositoryDAO extends BaseRepositoryDAO<Customer, Long> {
    private static CustomerRepositoryDAO customerRepositoryDAO;

    private CustomerRepositoryDAO() {
    }

    public static CustomerRepositoryDAO getInstance() {
        if (customerRepositoryDAO == null) {
            customerRepositoryDAO = new CustomerRepositoryDAO();
        }
        return customerRepositoryDAO;
    }

    @Override
    protected Class<Customer> getEntityClass() {
        return Customer.class;
    }
}
