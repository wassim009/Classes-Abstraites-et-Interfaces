package exercicefinal;

public abstract class Vehicule1 {
	private String nom;
    private String typeCarburant;

    public Vehicule1(String nom, String typeCarburant) {
        this.nom = nom;
        this.typeCarburant = typeCarburant;
    }

    public abstract void demarrer();
    public abstract void arreter();

    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Type de carburant: " + typeCarburant);
    }

	
}
