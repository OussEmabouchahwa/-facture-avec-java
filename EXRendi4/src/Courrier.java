import java.util.Objects;
public class Courrier {
	protected double  poids;
	private String mode;
	private String adress;
	    public String getMode() {
	        return mode;
	    }

	    public void setMode(String mode) {
	        this.mode = mode;
	    }
	    public String getAdresse() {
	        return adress;
	    }

	    public void setGrade(String adress) {
	        this.adress = adress;
	    }
	    public double  getPodes() {
	        return poids;
	    }

	    public void setPoide(double  poids) {
	        this.poids = poids;
	    }
	    public Courrier(double poids,String mode,String adress) {
	    	this.poids= poids;
	    	this.adress= adress ;
	    	this.mode= mode;
	    }
	    public int Valide() {
	    	if ( adress != "") {
	    		return 1;
	    	}
	    	return 0;  	
	    }
	    public double Montan() {
	    	
	    		
	    	return 0;
	    	
	    }
	    
	    	
	    public String ToString() {
	    	return "poides"+poids+"Adreess"+adress+"Mode"+mode;
	    }
	    

}
