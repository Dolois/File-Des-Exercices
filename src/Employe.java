public class Employe {

    String nom;
    String prenom;
    String numeroSocial;
    
    public Employe() {
        super();
    }
    
    public Employe(String nom) {
        super();
        this.nom = nom;
    }

    public Employe(String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public Employe(String nom, String prenom, String numeroSocial) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.numeroSocial = numeroSocial;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getNumeroSocial() {
        return numeroSocial;
    }
    public void setNumeroSocial(String numeroSocial) {
        this.numeroSocial = numeroSocial;
    }
}
