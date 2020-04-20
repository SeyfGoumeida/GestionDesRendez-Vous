package RdvApplication;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RDV_ implements Serializable {

	private final StringProperty firstName;
	private final StringProperty lastName;
        private final StringProperty date;
        private final StringProperty time;
        

	public RDV_(String firstName, String lastName, String date, String time) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
                this.date = new SimpleStringProperty(date);
                this.time = new SimpleStringProperty(time);
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
        public String getDate() {
		return date.get();
	}
        public String getTime() {
		return time.get();
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	public void setDate(String date) {
		this.date.set(date);
	}
        public void setTime(String time) {
		this.time.set(time);
	}
	public StringProperty lastNameProperty() {
		return lastName;
	}
        public StringProperty dateProperty() {
		return date;
	}
        public StringProperty timeProperty() {
		return time;
	}
     

}