/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctp.proyect;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Dits
 */
public class AgregarController implements Initializable {

  ObservableList<String> paises = FXCollections.observableArrayList("item-1", "item-2", "item-3", "item-4", "item-5");

 @FXML 
 private ComboBox<String> cbx;

    public AgregarController() {
        this.cbx = new ComboBox<>(paises);
    }
    
 
  
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
