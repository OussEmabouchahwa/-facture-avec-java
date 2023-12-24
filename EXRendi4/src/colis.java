// ... (other code remains the same)

public class colis extends Courrier {
    private double volim;

    public double getVolim() {
        return volim;
    }

    public void setVolim(double volim) {
        this.volim = volim;
    }

    public colis(double poids, String mode, String adress, double volim) {
        super(poids, mode, adress);
        this.volim = volim;
    }

    public double CalculeC() {
        double v;
        if (super.poids > 50) {
            v = 0;
        } else {
            v = super.Valide();
        }
        if (v == 1) {
            if (super.getMode().equals("normal")) {
                return (volim * 0.25) + super.getPodes();
            } else if (super.getMode().equals("express")) {
                return 2 * ((volim * 0.25) + super.getPodes());
            }
        }
        return 0;
    }

    public void AfficherColis() {
        if (super.Valide() == 1) {
            System.out.println("volim" + volim);
            System.out.println("prix à payer" + CalculeC());
            super.ToString();
        }
    }
}

// ... (other code remains the same)
