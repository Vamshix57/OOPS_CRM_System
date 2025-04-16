public class RegularCustomer extends Customer {
    public RegularCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public void showCustomerType() {
        System.out.println("Regular Customer: " + getName());
    }
}
