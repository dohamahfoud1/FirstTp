public class professeur {
    private String nom;
    private String prenom;
    private String matricule;

    public professeur(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Matricule: " + matricule);
    }

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Mahfoud", "Doha", "123456");
        etudiant1.afficher();
    }
}
