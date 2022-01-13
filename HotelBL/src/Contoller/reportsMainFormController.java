package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class reportsMainFormController {
    public Button MonthlyBtn;
    public Button yearlyBtn;
    public Button backBtn;

    public void PressToMonthly(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/monthlyreport1Form.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) yearlyBtn.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void PressToYearly(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/yearlyreport1Form.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) MonthlyBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void navigatBack(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) backBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
