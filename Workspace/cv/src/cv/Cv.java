package cv;

import java.util.Arrays;

public class Cv {

	private static String nom;
	private static String prenom;
	private static String formation;
	private static int experience;
	private static String[] competences = new String[5];
	private static String attentes;
	
	public static void main(String[] args) {
		
		String competencesAI[] = new String[] {"Perséverant", "Travaillant quand il s'y met"};
		Cv andrewI = new Cv("Andrew","Idehen", "Technique d'informatique de gestion", 2, competencesAI, "Maitriser Git d'ici la fin de la session");
		affiche(andrewI);
		
		System.out.println();
		
		String competencesAA[] = new String[] {"Apprend facilement", "Créatif"};
		Cv andrewA = new Cv("Andrew","Abou Antoun", "Technique d'informatique de gestion", 5, competencesAA, "Maitriser Git d'ici la fin de la session");
		affiche(andrewA);
	}
	
	public static void affiche (Cv personne) {
		
		String affichage ="Bienvenue chez Barette!" + 
				"\nNom: " + personne.getNom()
				+ "\n"+ "Prenom: " + personne.getPrenom()
				+ "\n"+ "Formation: " + personne.getFormation()
				+ "\n"+ "Expérience de travail (nombre d'années): " + personne.getExperience()
				+ "\n"+ "Competences: " + Arrays.toString(personne.getCompetences())
				+ "\n"+ "Attentes vis à vis le cours 4B4: " + personne.getAttentes();
		
		System.out.println(affichage);
	} 
	
	public Cv(String nom, String prenom, String formation, int experience, String [] competences, String attentes) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.experience = experience;
		this.competences = competences;
		this.attentes = attentes;
	}
	
	public static String getNom() {
		return nom;
	}
	
	public static String getPrenom() {
		return prenom;
	}
	
	public static String getFormation() {
		return formation;
	}
	
	public static int getExperience() {
		return experience;
	}
	
	public static String[] getCompetences() {
		return competences;
	}
	
	public static String getAttentes() {
		return attentes;
	}
}
