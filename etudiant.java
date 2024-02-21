public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private String matricule;
    private float note;

    public Etudiant(String nom, String prenom, int age, String matricule, float note) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.matricule = matricule;
        this.note = note
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age + ", Matricule: " + matricule,float note);
    }

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Dupont", "Jean", 20, "123456",16.5);
        etudiant1.afficher();
    }
}
