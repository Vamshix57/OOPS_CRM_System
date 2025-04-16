import java.util.ArrayList;
import java.util.List;

public class SalesRep {
    private String name;
    private List<Interaction> interactions;

    public SalesRep(String name) {
        this.name = name;
        this.interactions = new ArrayList<>();
    }

    public void addInteraction(Interaction interaction) {
        interactions.add(interaction);
    }

    public void showAllInteractions() {
        System.out.println("Interactions for SalesRep: " + name);
        for (Interaction i : interactions) {
            i.logInteraction();
        }
    }
}
