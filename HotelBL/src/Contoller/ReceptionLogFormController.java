package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionLogFormController {

    public Button ReservationId;
    public Button MealPlansId;
    public Button RlistId;
    public Button SearchID;
    public Button noticeID;
    public Button Exitid;

    public void PressToReservations(ActionEvent actionEvent) throws IOException {

            URL resource = getClass().getResource("../View/ReservationForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) ReservationId.getScene().getWindow();
            window.setScene(new Scene(load));
    }

    public void PressToMealPlans(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/MealPlansForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) MealPlansId.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToRoomTypes(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/RoomTypesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) RlistId.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToSearch(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/SearchForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) SearchID.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToNotices(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/NoticeForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) noticeID.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressExit(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Exitid.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
