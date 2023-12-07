import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        manage:
        while (true){
        int p ;
        Scanner scanner =new Scanner(System.in);
        System.out.println("entre opion : ");
        p=scanner.nextInt();
        switch (p){
            case 1:
                
                System.out.println("entre le nom : ");
                String n = scanner.next();

                System.out.println("entre le prenom : ");
                String pr = scanner.next();

                System.out.println("entre le email : ");
                String e = scanner.next();

                System.out.println("entre le numero : ");
                String no = scanner.next();

                Contact contact =  new Contact(n,pr,e,no);
                contactManager.addContact(contact);
                contactManager.afficherContact();
                break;

            case 2 :
                System.out.println("entre le nom : ");
                String nn=scanner.next();
                System.out.println("entre le pre : ");
                String pp= scanner.next();
                contactManager.removeContact(nn,pp);
                contactManager.afficherContact();
                break;

            case 3:
                System.out.println("entre nom: ");
                String ss = scanner.next();
                System.out.println("entre prenom: ");
                String ppp=scanner.next();
                System.out.println("entre newEmail: ");
                String ooo = scanner.next();
                System.out.println("entre number: ");
                String kk = scanner.next();
                contactManager.updateContact(ss,ppp,ooo,kk);
                contactManager.afficherContact();
                break;
            case 4:
                System.out.println("chercher le Mr nom :");
                String l =scanner.next();
                System.out.println("chercher le Mr prenom");
                String m =scanner.next();
                contactManager.serachContact(l,m);
                contactManager.afficherContact();

            case 5:
                break manage;

            default:
                System.out.println("makinchi");
                break;
        }}

    }
}