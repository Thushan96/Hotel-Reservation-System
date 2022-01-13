package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminMealFormController {
    public Button newMealbtn;
    public Button ModifyMealBtn;
    public Button DeleteMealBtn;
    public Button Backbtn;

    public void PressToAddNewMeal(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/NewMealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) newMealbtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToModifyMeal(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/ModifyMealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ModifyMealBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void pressToDeleteMeal(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/DeleteMealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Backbtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToGoBack(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Backbtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
