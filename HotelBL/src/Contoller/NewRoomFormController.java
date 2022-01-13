package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class NewRoomFormController {
    public Button Savebtn;
    public Button cancelBtn;

    public void PressToSave(ActionEvent actionEvent) throws IOException {
        new Alert(Alert.AlertType.INFORMATION,"Room has been added. ", ButtonType.CLOSE).show();
        URL resource = getClass().getResource("../View/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Savebtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToCancel(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) cancelBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
