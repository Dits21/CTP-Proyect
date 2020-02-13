/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctp.proyect;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Dits
 */
public class CTPproyectController implements Initializable {
 

       @FXML
    private void Agregar(ActionEvent event) throws IOException {
   
      Parent parent =FXMLLoader.load(getClass().getResource("Agregar.fxml"));
    Stage stage =new Stage();
    Scene scene = new Scene (parent);
    stage.setScene(scene);
    stage.setTitle("Menu de Añadir Miembros");
    stage.show();

    }
    
       @FXML
    private void Buscar(ActionEvent event) throws IOException {
          Parent parent =FXMLLoader.load(getClass().getResource("Buscar.fxml"));
    Stage stage =new Stage();
    Scene scene = new Scene (parent);
    stage.setScene(scene);
    stage.setTitle("Menu para Buscar Miembros");
    stage.show();
        
    }
    
       @FXML
    private void eliminar(ActionEvent event) throws IOException {
         Parent parent =FXMLLoader.load(getClass().getResource("Eliminar.fxml"));
    Stage stage =new Stage();
    Scene scene = new Scene (parent);
    stage.setScene(scene);
    stage.setTitle("Menu para Eliminar Miembros");
    stage.show();
        
    }
    
       @FXML
    private void estadisticas(ActionEvent event) throws IOException {
          Parent parent =FXMLLoader.load(getClass().getResource("Estadisticas.fxml"));
    Stage stage =new Stage();
    Scene scene = new Scene (parent);
    stage.setScene(scene);
    stage.setTitle("Menu de Estadisticas");
    stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
   
   
    
}
