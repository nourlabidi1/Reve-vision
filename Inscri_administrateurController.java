/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class Inscri_administrateurController implements Initializable {

    @FXML
    private Button home;
   @FXML
    private Button btn_inscription;
    @FXML
    private Button btn_connection ;
    @FXML
    private Button Home_button ;
      @FXML
        public void btn_home(ActionEvent event) throws Exception{
        Stage stage = (Stage) Home_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage.setScene(new Scene(root,750,500));
        
    }
      @FXML
    public void btn_se_connecter(ActionEvent event) throws Exception{
        Stage stage = (Stage) btn_connection.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.setScene(new Scene(root,750,500));
        
    }
           @FXML
    public void handle_btn_inscription(ActionEvent event) throws Exception {
        //System.out.println("Nour");
        Stage stage = (Stage) btn_inscription.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("inscription.fxml"));
        stage.setScene(new Scene(root,750,500));

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
