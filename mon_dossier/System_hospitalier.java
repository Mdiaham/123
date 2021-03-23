package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyser la requête: cela consiste en une examination de la requête recue et de données les différentes informations 
                //concernant le supposé malade ; ca retourne apres requete analysée si effectué
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Comparaison des données: cela consiste à detecter les similitudes avec les signes des des 
                // autres maladies et retourne cluster trouvé si possible 
		return "Cluster trouvé";
	}

}
