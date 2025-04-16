public class Main {
    public static void main(String[] args) {
        Customer vip = new VIPCustomer("Alice", "alice@vip.com");
        Customer regular = new RegularCustomer("Bob", "bob@regular.com");

        SalesRep john = new SalesRep("John");

        Interaction call1 = new Call(vip, "2025-04-16");
        Interaction email1 = new Email(regular, "2025-04-15");
        Interaction meeting1 = new Meeting(vip, "2025-04-14");

        john.addInteraction(call1);
        john.addInteraction(email1);
        john.addInteraction(meeting1);

        vip.showCustomerType();
        regular.showCustomerType();
        john.showAllInteractions();
    }
}
