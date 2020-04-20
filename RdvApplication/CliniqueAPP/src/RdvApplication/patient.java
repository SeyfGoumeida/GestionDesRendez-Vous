package RdvApplication;

import java.io.Serializable;

public class patient implements Serializable {
    private String nom;
    private String prenom;
    private String adresse;
    private String phone;
    private String email;
    private String info_med;

    public patient() { }

    public patient(String nom, String prenom, String adresse, String phone, String email, String info_med) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
        this.info_med = info_med;
    }

    // GETTERS

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    // SETTERS

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the info_med
     */
    public String getInfo_med() {
        return info_med;
    }

    /**
     * @param info_med the info_med to set
     */
    public void setInfo_med(String info_med) {
        this.info_med = info_med;
    }
    
   @Override
    public String toString() {
        return this.prenom+" "+this.nom;
    }

}
