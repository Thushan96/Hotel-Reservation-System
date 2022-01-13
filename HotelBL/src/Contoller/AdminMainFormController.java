package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminMainFormController {
    public Button Exitbtn;
    public Button RoomsBtn;
    public Button MealBtn;
    public Button ReportsBtn;

    public void PressToGetReports(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/reportsMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ReportsBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToMeals(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminMealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) MealBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) RoomsBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToExit(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Exitbtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
