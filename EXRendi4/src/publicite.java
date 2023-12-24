
public class publicite extends Courrier {

	
    public publicite (double poids,String mode,String adress) {
    	super(poids,mode,adress);
    
    }
    public double Calculep() {
        if(super.Valide()==1) {
            if (super.getMode().equals("normal")) {	
                return 5*super.getPodes();	
            } else if (super.getMode().equals("express")) {
                return 2*(5*super.getPodes());
            }
        }
        return 0;
    }
   public void AfficherLettre() {
	   if(super.Valide()==1) {
			System.out.println("prix a payer"+Calculep());

	   super.ToString();
	   }
   }
}



