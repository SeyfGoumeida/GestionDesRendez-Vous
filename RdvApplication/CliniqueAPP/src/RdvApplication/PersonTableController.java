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

public class PersonTableController {
	
	@FXML
	private TextField filterField;
	@FXML
	private TableView<Person> personTable;
	@FXML
	private TableColumn<Person, String> firstNameColumn;
	@FXML
	private TableColumn<Person, String> lastNameColumn;
    @FXML
	private TableColumn<Person, String> adresseColumn;
    @FXML
	private TableColumn<Person, String> phoneColumn;
    @FXML
	private TableColumn<Person, String> emailColumn;
    @FXML
	private TableColumn<Person, String> infoColumn;

	private ObservableList<Person> masterData = FXCollections.observableArrayList();

    @FXML
    private JFXButton bck;
    @FXML
    private JFXButton sp; 
    @FXML
    private JFXButton ajouter;

    @FXML
    public void imprimer(ActionEvent actionEvent) throws IOException{
        ArrayList<String> A = new ArrayList<String>();
        String a ="Name" ;
        String b ="Prenom" ;
        String c ="Adresse" ;
        String d ="Phone" ;
        String e ="Email" ;
        String f ="Medicale Info" ;
        String s1="";

        int i1 =12 - a.length();
        for(int j1=0;j1<i1;j1++){
            s1=s1+" ";
        }
       
        String s2="";
         i1 =12 - b.length();
              for(int j1=0;j1<i1;j1++){
                  s2=s2+" ";
              }
              String s3="";
              i1 =12 - c.length();
              for(int j1=0;j1<i1;j1++){
                  s3=s3+" ";
              }
               String s4="";
              i1 =12 - d.length();
              for(int j1=0;j1<i1;j1++){
                  s4=s4+" ";
              }
               String s5="";
              i1 =12 - e.length();
              for(int j1=0;j1<i1;j1++){
                  s5=s5+" ";
              }
        A.add(a + s1
            + b + s2
            + c + s3
            + d + s4
            + e + s5
            + f
            );
        A.add("     ");
        int i = personTable.getItems().size();

        for (int j=0;j<i;j++){
              s1="";
              i1 =12 - personTable.getItems().get(j).getFirstName().length();
              for(int j1=0;j1<i1;j1++){
                  s1=s1+" ";
              }
       
               s2="";
               i1 =12 - personTable.getItems().get(j).getLastName().length();
              for(int j1=0;j1<i1;j1++){
                  s2=s2+" ";
              }
              s3="";
              i1 =12 - personTable.getItems().get(j).getAdresse().length();
              for(int j1=0;j1<i1;j1++){
                  s3=s3+" ";
              }
              s4="";
              i1 =12 - personTable.getItems().get(j).getPhone().length();
              for(int j1=0;j1<i1;j1++){
                  s4=s4+" ";
              }
              s5="";
              i1 =12 - personTable.getItems().get(j).getemail().length();
              for(int j1=0;j1<i1;j1++){
                  s5=s5+" ";
              }
            
            A.add(personTable.getItems().get(j).getFirstName() + s1
            + personTable.getItems().get(j).getLastName() + s2
            + personTable.getItems().get(j).getAdresse() + s3
            + personTable.getItems().get(j).getPhone() + s4
            + personTable.getItems().get(j).getemail()+ s5
            + personTable.getItems().get(j).getInfo()
            );
        }
        System.out.println(A);
        Gestion g = new Gestion();
        g.ajouterPatients_ECRASER_temporelle(A);
   //////////////////////////////////////////just to tst impression you can delete it ////////////////////////////////////////////////////////////////
  /*  String filename = ("Temp_pat.txt" );

        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();

        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;

            javax.print.PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);

            javax.print.PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();

            javax.print.PrintService service = ServiceUI.printDialog(null, 120, 120,printService, defaultService, flavor, pras);

        if (service != null) {

            DocPrintJob job = service.createPrintJob();

            FileInputStream fis;

            try {

                fis = new FileInputStream(filename);

                DocAttributeSet das = new HashDocAttributeSet();

                Doc doc = new SimpleDoc(fis, flavor, das);

                try {

                    job.print(doc, pras);

                    try {

                        Thread.sleep(10000);

                    } catch (InterruptedException ex) {

                        ex.printStackTrace();

                    }

                } catch (PrintException ex) {

                    ex.printStackTrace();

                }



            } catch (FileNotFoundException ex) {

                ex.printStackTrace();

            }

        }
    */  /////////////////////////////////////////////////////////////////////////////////////////////////
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
                stage2.setTitle("SuprimerPatient");
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	/**
	 * Just add some sample data in the constructor.
	 */
	public PersonTableController() {
            Gestion g = new Gestion();
            g.AfficherListesPatients();
            ArrayList<patient> A = new ArrayList<patient>();
            A = g.ListesPatients();
            for(patient p : A){
                		masterData.add(new Person(p.getNom(), p.getPrenom(),p.getAdresse(),p.getPhone(),p.getEmail(),p.getInfo_med()));

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
		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
		adresseColumn.setCellValueFactory(cellData -> cellData.getValue().adresseProperty());
                phoneColumn.setCellValueFactory(cellData -> cellData.getValue().phoneProperty());
                emailColumn.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
                infoColumn.setCellValueFactory(cellData -> cellData.getValue().infoProperty());
		// 1. Wrap the ObservableList in a FilteredList (initially display all data).
		FilteredList<Person> filteredData = new FilteredList<>(masterData, p -> true);
		
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
				} else if (person.getAdresse().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; // Filter matches last name.
				}else if (person.getPhone().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; // Filter matches last name.
				}else if (person.getemail().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; // Filter matches last name.
				}else if (person.getInfo().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; // Filter matches last name.
				}
                               
				return false; // Does not match.
			});
		});
		
		// 3. Wrap the FilteredList in a SortedList. 
		SortedList<Person> sortedData = new SortedList<>(filteredData);
		
		// 4. Bind the SortedList comparator to the TableView comparator.
		// 	  Otherwise, sorting the TableView would have no effect.
		sortedData.comparatorProperty().bind(personTable.comparatorProperty());
		
		// 5. Add sorted (and filtered) data to the table.
		personTable.setItems(sortedData);
                
                ///////////////////////////////
        
                //////////////
	}

}
