package RdvApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Gestion {

    void suprdv(rdv r){
                        ArrayList<rdv> peoples = new ArrayList<>();
                        Gestion g = new Gestion();
                        peoples= g.ListesRdvs();
                     ArrayList<rdv> q = new ArrayList<>(); 
         for(rdv pt : peoples){            
         
           
            if (pt.getNom().equalsIgnoreCase(r.getNom()) && pt.getPrenom().equalsIgnoreCase(r.getPrenom()) && pt.getDate().equalsIgnoreCase(r.getDate()) 
                &&    pt.getTime().equalsIgnoreCase(r.getTime())
                    )  {
                System.out.println("kel : "+pt.toString());
            }else{
                q.add(pt);
            }
        }
         
        
                        
                        g.ajouterRDV_ECRASER(q);
    }
    void suprdvnomprenom(String n,String p){
                        ArrayList<rdv> peoples = new ArrayList<>();
                        Gestion g = new Gestion();
                        peoples= g.ListesRdvs();
                        System.out.println("wach 3amiiiii");
                     ArrayList<rdv> q = new ArrayList<>(); 
         for(rdv pt : peoples){            
         
           
            if (pt.getNom().equalsIgnoreCase(n) && pt.getPrenom().equalsIgnoreCase(p)
                    )  {
                System.out.println("kel : "+pt.toString());
            }else{
                q.add(pt);
            }
        }
         
        
                        
                        g.ajouterRDV_ECRASER(q);
    }
    void suprdvnom(String n){
                        ArrayList<rdv> peoples = new ArrayList<>();
                        Gestion g = new Gestion();
                        peoples= g.ListesRdvs();
                        System.out.println("wach 3amiiiii");
                     ArrayList<rdv> q = new ArrayList<>(); 
         for(rdv pt : peoples){            
         
           
            if (pt.getNom().equalsIgnoreCase(n) 
                    )  {
                System.out.println("kel : "+pt.toString());
            }else{
                q.add(pt);
            }
        }
         
        
                        
                        g.ajouterRDV_ECRASER(q);
    }
    void suprdvprenom(String p){
                        ArrayList<rdv> peoples = new ArrayList<>();
                        Gestion g = new Gestion();
                        peoples= g.ListesRdvs();
                        System.out.println("wach 3amiiiii");
                     ArrayList<rdv> q = new ArrayList<>(); 
         for(rdv pt : peoples){            
         
           
            if (pt.getPrenom().equalsIgnoreCase(p) 
                    )  {
                System.out.println("kel : "+pt.toString());
            }else{
                q.add(pt);
            }
        }
         
        
                        
                        g.ajouterRDV_ECRASER(q);
    }
///////////////////////////sup patient////////////
    void sup(patient p){
                        ArrayList<patient> peoples = new ArrayList<>();
                        Gestion g = new Gestion();
                        peoples= g.ListesPatients();
                     ArrayList<patient> q = new ArrayList<>(); 
         for(patient pt : peoples){            
         if (p.getPrenom().equalsIgnoreCase("")){
                
            if (pt.getNom().equalsIgnoreCase(p.getNom())
                    
                    )  {
                System.out.println("kel : "+pt.toString());
            }else{
                q.add(pt);
            }
        
            }else if(p.getNom().equalsIgnoreCase("")){
                
           
            if (pt.getPrenom().equalsIgnoreCase(p.getPrenom())
                    
                    )  {
                System.out.println("kel : "+pt.toString());
            }else{
                q.add(pt);
            }
        
            }
         else{
           
            if (pt.getNom().equalsIgnoreCase(p.getNom()) && pt.getPrenom().equalsIgnoreCase(p.getPrenom()) 
                    
                    )  {
                System.out.println("kel : "+pt.toString());
            }else{
                q.add(pt);
            }
        }
         }
        
                        
                        g.ajouterPatients_ECRASER(q);
    }
////////////////////////////////////////////ajouterrdvtofile(modeappend)/////////////////////////////////////////////////////////////////////

        void ajouterRdv(rdv r){
            
     
                  //list intermédiare of people/////
                ArrayList<rdv> people = new ArrayList<>();
            ////récupérer all what the file contient of people on the list
        try{
            FileInputStream readData = new FileInputStream("rdvdata.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            people = (ArrayList<rdv>) readStream.readObject();
            readStream.close();

          
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
       ///////ajouter new people////
       
        //       people.clear();
        boolean b = false ; 
        for(rdv pt : people){
            if (pt.getDate().equalsIgnoreCase(r.getDate()) && pt.getTime().equalsIgnoreCase(r.getTime()) )  b = true;
        }
            System.out.println("hooooooooooolaaaaaaaaaaaaaaaaaaaab"+!b);
        boolean c = false ;
         Gestion g = new Gestion();
            ArrayList<patient> A = new ArrayList<patient>();
            A = g.ListesPatients();
        for(patient p : A){
                if(p.getNom().equalsIgnoreCase(r.getNom())&&p.getPrenom().equalsIgnoreCase(r.getPrenom())) c=true;

            }
        System.out.println("hooooooooooolaaaaaaaaaaaaaaaaaaaac"+c);
        if (!b&&c) people.add(r);
      


        //write to file
        try{
            FileOutputStream writeData = new FileOutputStream("rdvdata.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
           
            writeStream.writeObject(people);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
        
        }    
    
////////////////////////////////////////////ajouterpeopletofile(modeappend)/////////////////////////////////////////////////////////////////////

        void ajouterPatient(patient p){
            
     
                  //list intermédiare of people/////
                ArrayList<patient> people = new ArrayList<>();
            ////récupérer all what the file contient of people on the list
        try{
            FileInputStream readData = new FileInputStream("peopledata.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            people = (ArrayList<patient>) readStream.readObject();
            readStream.close();

          
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
       ///////ajouter new people////
       
        //       people.clear();
        boolean b = false ; 
        for(patient pt : people){
            if (pt.getNom().equalsIgnoreCase(p.getNom()) && pt.getPrenom().equalsIgnoreCase(p.getPrenom()) )  b = true;
        }

        if (!b) people.add(p);
      


        //write to file
        try{
            FileOutputStream writeData = new FileOutputStream("peopledata.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
           
            writeStream.writeObject(people);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
        
        }
     ////////////////////////////////////////////////////////////////////////////
        
////////////////////////////////////////////ajouterpeopletofile(modeECRASEMENT)/////////////////////////////////////////////////////////////////////

        void ajouterPatients_ECRASER(ArrayList<patient> people){
            
     
                  //list intermédiare of people/////
            ////récupérer all what the file contient of people on the list
       
       ///////ajouter new people////
      

        //write to file
        try{
            FileOutputStream writeData = new FileOutputStream("peopledata.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
           
            writeStream.writeObject(people);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
        
        }
     
        
////////////////////////////////////////////ajouterpeopletofile(modeECRASEMENT)/////////////////////////////////////////////////////////////////////

        void ajouterPatients_ECRASER_temporelle(ArrayList<String> people) throws IOException{
            
     
                  //list intermédiare of people/////
            ////récupérer all what the file contient of people on the list
       
       ///////ajouter new people////
            System.out.println(people);

            FileWriter writer = new FileWriter("RandezVous.txt"); 
for(String str: people) {
  writer.write(str + System.lineSeparator());
}
writer.close();
        
        }
     
        
   /////////////////////////////////////////ajouterpeopletofile(modeECRASEMENT)/////////////////////////////////////////////////////////////////////

        void ajouterRDV_ECRASER(ArrayList<rdv> people){
            
     
                  //list intermédiare of people/////
            ////récupérer all what the file contient of people on the list
       
       ///////ajouter new people////
      

        //write to file
        try{
            FileOutputStream writeData = new FileOutputStream("rdvdata.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
           
            writeStream.writeObject(people);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
        
        }
     
        
        
        
        
        
        ///////////////////////////////////////////////////////////////////////:
        
        
        
        
        
        
        
        
        
        ///////////////////////////////////////////////////////////////////////:
        
        void AfficherListesPatients(){
                    ///////////////////////////////lire//////////////////////////////////////
        try{
            FileInputStream readData = new FileInputStream("peopledata.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList people = (ArrayList<patient>) readStream.readObject();
            readStream.close();

            System.out.println(people.toString());
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    

    ////////////////////////////////////////////////////////////////////////////// 
        }
        ///////////////////////////////rdvaffichage///////////////////////////
           void AfficherListesRdv(){
                    ///////////////////////////////lire//////////////////////////////////////
        try{
            FileInputStream readData = new FileInputStream("rdvdata.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList people = (ArrayList<rdv>) readStream.readObject();
            readStream.close();

            System.out.println(people.toString());
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    

    ////////////////////////////////////////////////////////////////////////////// 
        }
        ///////////////////////////////////////////////////////////////////
        ArrayList<patient> ListesPatients(){
                    ///////////////////////////////lire//////////////////////////////////////
                                ArrayList<patient> L = new ArrayList<>();

        try{
            FileInputStream readData = new FileInputStream("peopledata.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList people = (ArrayList<patient>) readStream.readObject();
            L = people;
            readStream.close();

            System.out.println(people.toString());
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    
return L;
    ////////////////////////////////////////////////////////////////////////////// 
        }
        /////////////////////////////retournet listes rdv////////////////////
        ArrayList<rdv> ListesRdvs(){
                    ///////////////////////////////lire//////////////////////////////////////
                                    ArrayList<rdv> L = new ArrayList<>();

        try{
            FileInputStream readData = new FileInputStream("rdvdata.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList people = (ArrayList<rdv>) readStream.readObject();
            L = people;
            readStream.close();

            System.out.println(people.toString());
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    
return L;
    ////////////////////////////////////////////////////////////////////////////// 
        }
        //////////////////////////////////////////////////////////////////////

    void impRdv(rdv r) throws IOException {
        ArrayList<rdv> L = new ArrayList<rdv>();
        boolean f=false;
                    Gestion g = new Gestion();      

        L = g.ListesRdvs();
        for(rdv k : L){
            if(k.getDate().equalsIgnoreCase(r.getDate())
            && k.getNom().equalsIgnoreCase(r.getNom())
                    && k.getPrenom().equalsIgnoreCase(r.getPrenom())
                     && k.getTime().equalsIgnoreCase(r.getTime())
                    ){ f=true;  System.out.println("la3laaaaaaaaam");}
        }
                    System.out.println("ma sebtooooooooooooooooooooo"+f);

        //randez-vous trouvé
        if(f){
            System.out.println("sebtooooooooooooooooooooo");
            ArrayList<String> S = new ArrayList<String>();
            
            S.add("Nom : "+r.getNom());
            S.add("Prenom : "+r.getPrenom());
            S.add("Date : "+r.getDate());
            S.add("Time : "+r.getTime());
                    
            g.ajouterPatients_ECRASER_temporelle(S);
            
            
            
             java.awt.Desktop.getDesktop().print(new File("RandezVous.txt")); 

            
            
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //////////////////////////imprimer//////////////////////////////////
  @FXML
    public void imprimerX(ActionEvent actionEvent) throws IOException{

            //////////ici c est une bonne solution si tu veut use file choser///
  /*   JFileChooser dial = new JFileChooser();
       	     int res = dial.showOpenDialog(null);
       	     if (res != JFileChooser.APPROVE_OPTION) {
       	    	 return;
       	    	 }
       	  File fichier = dial.getSelectedFile();   // récupartion du fichier selectionné
 
 	   Desktop.getDesktop().print(fichier);
*/
// imprimer 
 java.awt.Desktop.getDesktop().print(new File("RandezVous.txt")); 
 
        	
    
    }
    
    
}
