/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package lp.projet;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KAMUI
 */
public class ArchiveController implements Initializable {

    public void showDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }   
  public void showMembers(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Members.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }  
    public void showArchive(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Archive.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }  
        
    public void showAnnonce(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Annonce.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
