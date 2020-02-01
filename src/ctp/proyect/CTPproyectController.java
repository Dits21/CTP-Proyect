/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctp.proyect;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 *
 * @author Dits
 */
public class CTPproyectController implements Initializable {
   
    
       @FXML
    private void Agregar(ActionEvent event) {
        System.out.println("You clicked me!");
        
    }
    
       @FXML
    private void Buscar(ActionEvent event) {
        System.out.println("funciona 2");
        
    }
    
       @FXML
    private void eliminar(ActionEvent event) {
        System.out.println("funciona 3");
        
    }
    
       @FXML
    private void estadisticas(ActionEvent event) {
        System.out.println("funciona 4");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
   
   
    
}
