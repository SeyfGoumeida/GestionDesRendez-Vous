package RdvApplication;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class RdvApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL fxmlURL = getClass().getResource("pageprincipale.fxml");
        Node node = (Node) new FXMLLoader(fxmlURL).load();
        Scene scene = new Scene((Parent) node);
        stage.setTitle("Application de Gestion de RDV");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        launch(args);

    }

}