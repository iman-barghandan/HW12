import domains.Customer;
import services.CustomerService;

public class MainApp {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.insertCustomer("iman","brg","u2","p2");
    }
}
