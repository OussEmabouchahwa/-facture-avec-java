
public class lettre extends Courrier {
	private String format;
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    public lettre (double poids,String mode,String adress,String format) {
    	super(poids,mode,adress);
    	this.format= format;
    }
    public double CalculeM(String tarifa) {
        if(super.Valide()==1) {
            if (super.getMode().equals("normal")) {	
                if (tarifa.equals("A4")) {
                    return 2.50+super.getPodes();
                }
                if (tarifa.equals("A3")) {
                    return 3.50+super.getPodes();
                }
            } else if (super.getMode().equals("express")) {
                if (tarifa.equals("A4")) {
                    return 2*(2.50+ super.getPodes());
                }
                if (tarifa.equals("A3")) {
                    return 2*(3.50+super.getPodes());
                }
            }
        }
        return 0;
    }
   public void AfficherLettre() {
	   if(super.Valide()==1) {
		System.out.println("format"+format);
	   super.ToString();
	   }
   }
}
