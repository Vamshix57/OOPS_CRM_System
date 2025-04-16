public class Meeting extends Interaction {
    public Meeting(Customer customer, String date) {
        super(customer, date);
    }

    @Override
    public void logInteraction() {
        System.out.println("Meeting with " + customer.getName() + " on " + date);
    }
}
