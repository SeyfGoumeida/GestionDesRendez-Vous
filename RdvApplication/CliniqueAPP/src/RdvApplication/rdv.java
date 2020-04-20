package RdvApplication;

import java.io.Serializable;


public class rdv implements Serializable {
    private String nom;
    private String prenom;
    private String date;
    private String time;
 

    public rdv() {
    }

    public rdv(String nom, String prenom, String date, String time) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.time = time;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

   @Override
    public String toString() {
        return this.prenom+" "+this.nom+" "+this.date+" "+this.time;
    }


}
