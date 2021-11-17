/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.m.templd_uebung;

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
        // TODO
    }    

    @FXML
    private void DragDrop(DragEvent event) {
    }
    
}
