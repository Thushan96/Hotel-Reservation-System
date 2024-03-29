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

public class ModifyMealFormController {
    public Button saveBtn;
    public Button CancelBtn;

    public void PressTosave(ActionEvent actionEvent) throws IOException {
        new Alert(Alert.AlertType.INFORMATION,"Meal plan has been modified. ", ButtonType.CLOSE).show();
        URL resource = getClass().getResource("../View/AdminMealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) saveBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToCancel(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminMealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CancelBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
