import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactManager {
    public List<Contact> contacts;

    public ContactManager (){

        this.contacts = new ArrayList<>();
    }
    public void addContact(Contact contact){
        if(contacts.contains(contact)){
            System.out.println(" le contact existe deja !");
        }
        else {
        contacts.add(contact);
    }
    }
    public void removeContact(String nom , String prenom){
        for (Contact contact: contacts){
            if (contact.getNom().equals(nom) && contact.getPrenom().equals(prenom)) {
                contacts.remove(contact);
                System.out.println("Le Mr  " + prenom + " " + nom + " ete supprimer");
                return;
            }
        }
        System.out.println("Aucun contact trouvé avec ce nom et prénom : " + nom + " " + prenom);
    }

    public void updateContact(String nom ,String prenom ,String newEmail , String newNumero) {
        for (Contact contact : contacts) {
            if (contact.getNom().equals(nom) && contact.getPrenom().equals(prenom)) {
                contact.setEmail(newEmail);
                contact.setNumero(newNumero);
                System.out.println("Le Mr " + nom + " "+prenom+ " a été modifié");
                return;
            }
        }
        System.out.println("Pas de contact avec ce nom et prénom : " + nom + " " + prenom);
    }

    public void afficherContact(){
        for (Contact contact:contacts){
            System.out.println("voila : "+contact);
        }
    }
    public Contact serachContact(String nom,String prenom){
        for (Contact contact:contacts){
            if (contact.getNom().equals(nom) && contact.getNom().equals(prenom)){
                return contact;
            }
        }
        return null;
    }

}
