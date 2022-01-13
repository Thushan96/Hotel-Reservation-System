package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class yearlyreport1FormController {
    public Button backBtn;
    public Button Cancelbtn;

    public void navigatBack(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/reportsMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) backBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToCnacel(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Cancelbtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
