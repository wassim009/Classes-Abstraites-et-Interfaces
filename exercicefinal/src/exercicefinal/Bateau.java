package exercicefinal;

public class Bateau extends Vehicule1 implements Flottant  {
	public Bateau(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }

    @Override
    public void demarrer() {
        System.out.println("Le bateau démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("Le bateau s'arrête.");
    }

    @Override
    public void flotter() {
        System.out.println("Le bateau flotte.");
    }
}
