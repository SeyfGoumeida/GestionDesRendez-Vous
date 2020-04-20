package RdvApplication;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class PageprincipaleController implements Initializable {

    public JFXButton r;
    public JFXButton p;

    

    public void rdv(javafx.event.ActionEvent actionEvent) {
        r.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) r.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("RdvTable.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("Rendez-vousTable");
                stage2.setScene(scene);
                stage2.show();


            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        });


    }


    public void pat(javafx.event.ActionEvent actionEvent) {
        p.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) p.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("PersonTable.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("PatiensTable");
                stage2.setScene(scene);
                stage2.show();


            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        });


    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
