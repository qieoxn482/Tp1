package cv;

public class Cv {

	private static String nom;
	private static String prenom;
	private static String formation;
	private static int experience;
	private static String[] competences = new String[5];
	private static String attentes;
	
	public static void main(String[] args) {
		
		
	}

	public void setNom(String nom) {
		nom = this.nom;
	}
	
	public static String getNom() {
		return nom;
	}
	
	public void setPrenom(String prenom) {
		prenom = this.prenom;
	}
	
	public static String getPrenom() {
		return prenom;
	}
	
	public void setFormation(String formation) {
		formation = this.formation;
	}
	
	public static String getFormation() {
		return formation;
	}
	
	public void setExperience(int experience) {
		experience = this.experience;
	}
	
	public static int getExperience() {
		return experience;
	}
	
	public void setCompetences(String[] competences) {
		competences = this.competences;
	}
	
	public static String[] getCompetences() {
		return competences;
	}
	
	public void setAttentes(String attentes) {
		attentes = this.attentes;
	}
	
	public static String getAttentes() {
		return attentes;
	}
}
