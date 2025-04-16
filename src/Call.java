public class Call extends Interaction {
    public Call(Customer customer, String date) {
        super(customer, date);
    }

    @Override
    public void logInteraction() {
        System.out.println("Call with " + customer.getName() + " on " + date);
    }
}
