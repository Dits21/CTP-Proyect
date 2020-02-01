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
public class CTPproyectController  {
   
    @FXML
    private Button AgregarMiembro;
    
     @FXML
    private Button BuscarMiembro;
    
     @FXML
    private Button EliminarMiembro;
    
     @FXML
    private Button Estadisticas;
    
    
    public void initialize(Stage primaryStage) {
        final Agregar a = new Agregar();
        //primer Boton
        AgregarMiembro.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
         System.out.println("este funciona");
       a.start(primaryStage);
      }
    });
        
           BuscarMiembro.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
          
       a.start(primaryStage);
      }
    });
           
        EliminarMiembro.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
          
       a.start(primaryStage);
      }
    });      
        
           Estadisticas.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
          
       a.start(primaryStage);
      }
    });
        
    }    
    
   
   
    
}
