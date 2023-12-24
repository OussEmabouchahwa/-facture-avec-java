import java.util.ArrayList;

public class boites {
    private ArrayList<Courrier> Lc;
    
    public boites() {
        this.Lc = new ArrayList<>();
    }
    
    public ArrayList<Courrier> getLM() {
        return Lc;
    }
    
    public void setLM(ArrayList<Courrier> Lc) {
        this.Lc = Lc;
    }
    
    public void ajouterCourrier(Courrier courrier) {
        this.Lc.add(courrier);
    }
    
    public double affranchir() {
        double total = 0;
        for (Courrier courrier : Lc) {
            if (courrier instanceof lettre) {
                total += ((lettre) courrier).CalculeM(((lettre) courrier).getFormat());
            } else if (courrier instanceof colis) {
                total += ((colis) courrier).CalculeC();
            } else if (courrier instanceof publicite) {
                total += ((publicite) courrier).Calculep();
            }
        }
        return total;
    }
    
    public int courriersInvalides() {
        int count = 0;
        for (Courrier courrier : Lc) {
            if (courrier.Valide() == 0) {
                count++;
            }
        }
        return count;
    }
    
    public void afficher() {
        for (Courrier courrier : Lc) {
            if (courrier instanceof lettre) {
                ((lettre) courrier).AfficherLettre();
            } else if (courrier instanceof colis) {
                ((colis) courrier).AfficherColis();
            } else if (courrier instanceof publicite) {
                ((publicite) courrier).AfficherLettre();
            }
        }
    }
}
