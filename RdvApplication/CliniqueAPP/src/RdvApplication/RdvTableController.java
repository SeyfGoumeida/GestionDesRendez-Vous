package RdvApplication;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class RdvTableController {
	
	@FXML
	private TextField filterField;
	@FXML
	private TableView<RDV_> personTable;
	@FXML
	private TableColumn<RDV_, String> firstNameColumn;
	@FXML
	private TableColumn<RDV_, String> lastNameColumn;
    @FXML
	private TableColumn<RDV_, String> dateColumn;
    @FXML
	private TableColumn<RDV_, String> timeColumn;
	private ObservableList<RDV_> masterData = FXCollections.observableArrayList();
    @FXML
    private JFXButton bck;   
    @FXML
    private JFXButton sp; 
    @FXML
    private JFXButton rv; 
    @FXML
    private JFXButton ajouter;
    @FXML
    private JFXButton ajouterdv;
    @FXML
    private JFXButton pr;


    @FXML
    private void impressionn(ActionEvent event) {
               
        
   pr.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) pr.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("impressionRDV.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("impressionRDV");
                stage2.setScene(scene);
                stage2.show();


                } catch (IOException e) {
                    Logger logger = Logger.getLogger(getClass().getName());
                    logger.log(Level.SEVERE, "Failed to create new Window.", e);
                }
            });
        
        
    }
 //////////////////////suprimer/////////////
  @FXML
    private void suppatient(ActionEvent event) {
               
        
   sp.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) sp.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("sup_pat.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("AjouterPatient");
                stage2.setScene(scene);
                stage2.show();


                } catch (IOException e) {
                    Logger logger = Logger.getLogger(getClass().getName());
                    logger.log(Level.SEVERE, "Failed to create new Window.", e);
                }
            });
        
        
    }
    
    
    
 //////////////////////suprimer/////////////
  @FXML
    private void suprdv(ActionEvent event) {
               
        
   rv.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) rv.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("sup_rdv.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("SuprimerRandez-vous");
                stage2.setScene(scene);
                stage2.show();


                } catch (IOException e) {
                    Logger logger = Logger.getLogger(getClass().getName());
                    logger.log(Level.SEVERE, "Failed to create new Window.", e);
                }
            });
        
        
    }
    
    
 
 /////////////////////ajouter/////////////////
          @FXML
    private void ajouterpatient(ActionEvent event) {
               
        
   ajouter.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) ajouter.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("addpat.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("AjouterPatient");
                stage2.setScene(scene);
                stage2.show();


                } catch (IOException e) {
                    Logger logger = Logger.getLogger(getClass().getName());
                    logger.log(Level.SEVERE, "Failed to create new Window.", e);
                }
            });
        
        
    }
         /////////////////////ajouter/////////////////
          @FXML
    private void ajouterrdv(ActionEvent event) {
               
        
   ajouterdv.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) ajouterdv.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("addrdv.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("AjouterRDV");
                stage2.setScene(scene);
                stage2.show();


                } catch (IOException e) {
                    Logger logger = Logger.getLogger(getClass().getName());
                    logger.log(Level.SEVERE, "Failed to create new Window.", e);
                }
            });
        
        
    }
        
          @FXML
    private void backto(ActionEvent event) {
              bck.setOnMouseClicked((MouseEvent aevent) -> {
                  try {
                      Stage stage = (Stage) bck.getScene().getWindow();
                      stage.close();
                      FXMLLoader fxmlLoader = new FXMLLoader();
                      fxmlLoader.setLocation(getClass().getResource("pageprincipale.fxml"));
                      Scene scene = new Scene(fxmlLoader.load());
                      Stage stage2 = new Stage();
                      stage2.setTitle("PagePrincipale");
                      stage2.setScene(scene);
                      stage2.show();
                  } catch (IOException e) {
                      Logger logger = Logger.getLogger(getClass().getName());
                      logger.log(Level.SEVERE, "Failed to create new Window.", e);
                  }
              });
    }

	public RdvTableController() {
            
            Gestion g = new Gestion();
            ArrayList<rdv> A = new ArrayList<rdv>();
            A = g.ListesRdvs();
            for(rdv p : A){
                		masterData.add(new RDV_(p.getNom(), p.getPrenom(),p.getDate(),p.getTime()));

            }
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 *
	 * Initializes the table columns and sets up sorting and filtering.
	 */
	@FXML
	private void initialize() {
		// 0. Initialize the columns.
		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
		dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
                timeColumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
		// 1. Wrap the ObservableList in a FilteredList (initially display all data).
		FilteredList<RDV_> filteredData = new FilteredList<>(masterData, p -> true);
		
		// 2. Set the filter Predicate whenever the filter changes.
		filterField.textProperty().addListener((observable, oldValue, newValue) -> {
			filteredData.setPredicate(person -> {
				// If filter text is empty, display all persons.
				if (newValue == null || newValue.isEmpty()) {
					return true;
				}
				
				// Compare first name and last name of every person with filter text.
				String lowerCaseFilter = newValue.toLowerCase();
				
				if (person.getFirstName().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; // Filter matches first name.
				} else if (person.getLastName().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; // Filter matches last name.
				}else if (person.getDate().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; // Filter matches date name.
				}
                                else if (person.getTime().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; // Filter matches time name.
				}
				return false; // Does not match.
			});
		});
		
		// 3. Wrap the FilteredList in a SortedList. 
		SortedList<RDV_> sortedData = new SortedList<>(filteredData);
		
		// 4. Bind the SortedList comparator to the TableView comparator.
		// 	  Otherwise, sorting the TableView would have no effect.
		sortedData.comparatorProperty().bind(personTable.comparatorProperty());
		
		// 5. Add sorted (and filtered) data to the table.
		personTable.setItems(sortedData);
                
                ///////////////////////////////
        
                //////////////
	}

}
