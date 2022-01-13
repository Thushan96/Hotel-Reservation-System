package Contoller;

import Model.Reservation;
import View.tm.Reservationtm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class RoomTypesFormController extends ReservationFormContoller {
    public TableView tblReservation;
    public TableColumn rID;
    public TableColumn nId;
    public TableColumn aId;
    public TableColumn tId;
    public TableColumn eId;
    public TableColumn deleteId;
    public Button BackId;
    public Label Availbtn;
    public Label Occbtn;
    public Label Totbtn;



    public void initialize(){
        ObservableList<Reservationtm> reservationstm= FXCollections.observableArrayList();
        for (Reservation d:reservationArrayList) {
            Button btn=new Button("Cancel");
            reservationstm.add(new Reservationtm(d.getRnumber(),d.getName(),d.getAddress(),d.getNIC(),d.getTelephoneNo(),d.getEmail(),btn));
            btn.setOnAction((e)->{

                ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure You want to Cancel reservation?", yes, no);
                alert.setTitle("Confirmation Alert");
                final Optional<ButtonType> result=alert.showAndWait();

                        if(result.orElse(no)==yes){
                            new Alert(Alert.AlertType.INFORMATION,"Reservation Cancelled",ButtonType.CLOSE).show();
                            reservationArrayList.remove(d);
                            initialize();

                        }
            });
        }


        tblReservation.setItems(reservationstm);
        rID.setCellValueFactory(new PropertyValueFactory<>("rnumber"));
        nId.setCellValueFactory(new PropertyValueFactory<>("name"));
        aId.setCellValueFactory(new PropertyValueFactory<>("address"));
        tId.setCellValueFactory(new PropertyValueFactory<>("telephoneNo"));
        eId.setCellValueFactory(new PropertyValueFactory<>("email"));
        deleteId.setCellValueFactory(new PropertyValueFactory<>("btn"));

        Availbtn.setText(Integer.toString(25-reservationstm.size()));
        Occbtn.setText(Integer.toString(reservationstm.size()));
        Totbtn.setText(Integer.toString(25));
    }


    public void PressToBack(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/ReceptionLogForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) BackId.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
