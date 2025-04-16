public abstract class Interaction {
    protected Customer customer;
    protected String date;

    public Interaction(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public abstract void logInteraction();
}
