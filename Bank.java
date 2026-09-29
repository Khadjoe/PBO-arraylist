import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(String f, String l) {
        this.customers.add(new Customer(f, l));
    }

    public int getNumOfCustomers() {
        return this.customers.size();
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < this.customers.size()) {
            return this.customers.get(index);
        }
        return null; 
    }
}