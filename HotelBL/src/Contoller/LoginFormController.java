package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public TextField Userid;
    public Button Loginbtn;
    public AnchorPane LoginFormContext;


    public void PressToLogin(ActionEvent actionEvent) throws IOException {
        if(Userid.getText().equals("USER")) {
            URL resource = getClass().getResource("../View/ReceptionLogForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) Userid.getScene().getWindow();
            window.setScene(new Scene(load));
        }else if (Userid.getText().equals("ADMIN")){
            URL resource = getClass().getResource("../View/AdminMainForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) Userid.getScene().getWindow();
            window.setScene(new Scene(load));

        }else {
            new Alert(Alert.AlertType.WARNING, "Wrong Username or Password Try again", ButtonType.CLOSE).show();
        }


    }
}
