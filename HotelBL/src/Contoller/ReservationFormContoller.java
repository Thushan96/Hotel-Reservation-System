package Contoller;

import Model.Reservation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class ReservationFormContoller {
    public TextField txtname;
    public TextField txtAddress;
    public TextField txtNIC;
    public TextField txtTelephoneNo;
    public TextField txtEmail;
    public Button Savebtn;

    public static ArrayList<Reservation> reservationArrayList=new ArrayList(25);
    public Button Cancelbtn;
    public ComboBox mealPlanId;
    public TextField txtRnumber;

    Random r=new Random();
    int x=r.nextInt(5001);
    Button b1=new Button("Okay");

    static ArrayList<String> mealPlansArrayList=new ArrayList(3);

    static {
        mealPlansArrayList.add("Local Meal");
        mealPlansArrayList.add("Chinese Meal");
        mealPlansArrayList.add("French Meal");
    }



    public void initialize(){
        ObservableList<String> observableList= FXCollections.observableArrayList();
        for (String d:mealPlansArrayList) {
            observableList.add(d);
        }
        mealPlanId.setItems(observableList);
    }

    public void okayAndSave(ActionEvent actionEvent) throws IOException {
        Reservation reservation=new Reservation(txtRnumber.getText(),txtname.getText(),txtAddress.getText(),txtNIC.getText(),txtTelephoneNo.getText(),txtEmail.getText());
        txtRnumber.clear();txtname.clear();txtAddress.clear();txtNIC.clear();txtTelephoneNo.clear();

        if (reservationArrayList.add(reservation)){
            new Alert(Alert.AlertType.INFORMATION,"Room reserved Successfully Reference number  "+x ,ButtonType.CLOSE).showAndWait();
            URL resource = getClass().getResource("../View/ReceptionLogForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) Savebtn.getScene().getWindow();
            window.setScene(new Scene(load));
        }else{
            new Alert(Alert.AlertType.ERROR,"Wrong Details Try Again",ButtonType.CLOSE).show();

        }

    }

    public void cancelAndBack(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/ReceptionLogForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) Cancelbtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
