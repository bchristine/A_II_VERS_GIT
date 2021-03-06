/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.m.templd_uebung;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import htl.m.templd_uebung.model.Person;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;

/**
 * FXML Controller class
 *
 * @author LenaF
 */
public class PrimaryController implements Initializable {

    @FXML
    private ImageView drag_drop;
    @FXML
    private Label lbl_vname;
    @FXML
    private Label lbl_id;
    @FXML
    private Label lbl_nname;
    @FXML
    private Label lbl_groesse;
    @FXML
    private Label lbl_gewicht;
    @FXML
    private Label lbl_bmi;
    @FXML
    private Label lbl_ffmi;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Person p = new Person(1, "Jane", "Doe", null, 50, 50, 180, 100.00, 30, 20);
        initializeLabelsWithPersons(p);
    }   
    
    private void initializeLabelsWithPersons(Person p){
        lbl_id.setText(""+p.getId());
        lbl_vname.setText(p.getVn());
        lbl_nname.setText(p.getNn());
        lbl_groesse.setText(""+p.getGroesse());
        lbl_gewicht.setText(""+p.getGewicht());
        lbl_bmi.setText(""+p.getBmi());
        lbl_ffmi.setText(""+p.getFfmi());
    }

    @FXML
    private void DragDrop(DragEvent event) {
    }
    
    public void auslesen(File f) throws FileNotFoundException, IOException{
        
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        String json = "";
        String temp = "a";
        
        while(temp!=null || temp != ""){
            
            temp = br.readLine();
            
            if(temp != null || temp !=" ")
            {
                json += temp;
            }
            
        }
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Person person = gson.fromJson(json, Person.class);
        
    } 
}
