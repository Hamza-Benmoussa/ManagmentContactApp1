public class Contact {
    private String nom;
    private String prenom;
    private String email;
    private String numero;
    public Contact (){

    }

    public Contact(String nom, String prenom, String email, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numero = numero;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "le nom : " +nom+ " le prenom : "+prenom+ " email: "+email+ " le numero: "+numero+ "." ;
    }
}
