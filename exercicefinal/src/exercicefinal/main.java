package exercicefinal;

public class main {
	    public static main(String[] args) {
	        Vehicule1[] vehicules = {
	            new Voiture("Tesla", "Électrique"),
	            new Bateau("Yacht", "Diesel"),
	            new Hydravion("Hydravion", "Essence")
	        };

	        for (Vehicule1 v : vehicules) {
	            v.demarrer();
	            v.arreter();
	            v.afficherInfos();

	            if (v instanceof Roulant) {
	                ((Roulant) v).rouler();
	            }
	            if (v instanceof Flottant) {
	                ((Flottant) v).flotter();
	            }
	        }
	    }
	}


