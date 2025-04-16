public class Email extends Interaction {
    public Email(Customer customer, String date) {
        super(customer, date);
    }

    @Override
    public void logInteraction() {
        System.out.println("Email sent to " + customer.getName() + " on " + date);
    }
}
