package gestiondeproduit;

public class ProduitAlimentaire implements Produit {
	private String nom;
    private double prixUnitaire;
    private int quantite;

    public ProduitAlimentaire(String nom, double prixUnitaire, int quantite) {
        this.setNom(nom);
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    @Override
    public double calculerValeurStock() {
        return prixUnitaire * quantite;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
