public class VIPCustomer extends Customer {
    public VIPCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public void showCustomerType() {
        System.out.println("VIP Customer: " + getName());
    }
}
