package RdvApplication;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	private final StringProperty firstName;
	private final StringProperty lastName;
	private final StringProperty adresse;
    private final StringProperty phone;
    private final StringProperty email;
    private final StringProperty info;

	public Person(String firstName, String lastName, String adresse, String phone, String email,String info) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		this.adresse = new SimpleStringProperty(adresse);
		this.phone = new SimpleStringProperty(phone);
		this.email = new SimpleStringProperty(email);
		this.info = new SimpleStringProperty(info);
	}
	
	public String getFirstName() {
		return firstName.get();
	}
	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}
	public StringProperty firstNameProperty() {
		return firstName;
	}
	public String getLastName() {
		return lastName.get();
	}
    public String getAdresse() {
		return adresse.get();
	}
    public String getPhone() {
		return phone.get();
	}
    public String getemail() {
		return email.get();
	}
    public String getInfo() {
		return info.get();
	}
	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
    public void setAdresse(String adresse) {
		this.adresse.set(adresse);
	}
    public void setPhone(String phone) {
		this.phone.set(phone);
	}
    public void setEmail(String email) {
		this.email.set(email);
	}
    public void setInfo(String info) {
		this.info.set(info);
	}
	public StringProperty lastNameProperty() {
		return lastName;
	}
	public StringProperty adresseProperty() {
		return adresse;
	}
    public StringProperty phoneProperty() {
		return phone;
	}
    public StringProperty emailProperty() {
		return email;
	}
    public StringProperty infoProperty() {
		return info;
	}
        
	@Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastName();
    }

}