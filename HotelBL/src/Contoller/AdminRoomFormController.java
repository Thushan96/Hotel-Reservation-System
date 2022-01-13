package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminRoomFormController {
    public Button Backbtn;
    public Button DeleteRoomBtn;
    public Button ModifyRoomBtn;
    public Button newRoombtn;

    public void PressToGoBack(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Backbtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void pressToDelete(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/DeleteRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Backbtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToModifyRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/ModifyRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ModifyRoomBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToAddNewRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/NewRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) newRoombtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
