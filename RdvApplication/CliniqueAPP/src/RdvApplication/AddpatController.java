package RdvApplication;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddpatController implements Initializable {
     @FXML
    public JFXTextField nomChamp;
     @FXML
    public JFXTextField prenomChamp;
     @FXML
    public JFXTextField c;
     @FXML
    public JFXTextField d;
     @FXML
    public JFXTextField e;
     @FXML
    public JFXTextField f;

    @FXML
    private JFXButton aj;
    @FXML
    private JFXButton bk;
  
    @FXML
    private void back(ActionEvent event) {
        bk.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) bk.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("PersonTable.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("PatientsTable");
                stage2.setScene(scene);
                stage2.show();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        });
    }
    
    @FXML
    private void ajouterpatient(ActionEvent event) {
        aj.setOnMouseClicked((MouseEvent aevent) -> {
            patient p = new patient(
                    nomChamp.getText(),
                    prenomChamp.getText(),
                    c.getText(),
                    d.getText(),
                    e.getText(),
                    f.getText()
            );
            Gestion g = new Gestion();
            g.ajouterPatient(p);
            g.AfficherListesPatients();
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
