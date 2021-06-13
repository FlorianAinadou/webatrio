package web.atrio.demo;

import java.util.Date;
import org.springframework.data.annotation.Id;


public class Person {
    @Id
    private String id;
    public String nom;
    public String prenom;
    public Date dateDeNaissance;
    public int age;

    public Person(String nom, String prenom, Date date){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = date;
    }


    public String getName() {
        return nom;
    }
}
