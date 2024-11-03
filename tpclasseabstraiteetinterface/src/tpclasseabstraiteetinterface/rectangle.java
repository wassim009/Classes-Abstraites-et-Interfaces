package tpclasseabstraiteetinterface;

public class rectangle extends forme {
	 private double longueur;
	    private double largeur;

	    public rectangle(double longueur, double largeur) {
	        this.longueur = longueur;
	        this.largeur = largeur;
	    }

	    @Override
	    public double calculerSurface() {
	        return longueur * largeur;
	    }

	    @Override
	    public double calculerPerimetre() {
	        return 2 * (longueur + largeur);
	    }
}
