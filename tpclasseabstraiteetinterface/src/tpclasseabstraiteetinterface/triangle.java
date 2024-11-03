package tpclasseabstraiteetinterface;

public class triangle extends forme {
	private double base;
    private double hauteur;
    private double cote1;
    private double cote2;
    private double cote3;

    public triangle(double base, double hauteur, double cote1, double cote2, double cote3) {
        this.base = base;
        this.hauteur = hauteur;
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }

    @Override
    public double calculerSurface() {
        return (base * hauteur) / 2;
    }

    @Override
    public double calculerPerimetre() {
        return cote1 + cote2 + cote3;
    }
}
