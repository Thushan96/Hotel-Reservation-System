package Contoller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class DeleteRoomFormController {
    public Button CancelBtn;
    public Button deleteBtn;

    public void PressToCancel(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CancelBtn.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void PressToDelete(ActionEvent actionEvent){


        deleteBtn.setOnAction(event -> {

            ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
            ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure You want to delete the room?", yes, no);
            final Optional<ButtonType> result= alert.showAndWait();

            if(result.orElse(no)==yes){
                new Alert(Alert.AlertType.INFORMATION,"Room deleted",ButtonType.CLOSE).show();

                URL resource = getClass().getResource("../View/AdminRoomForm.fxml");
                Parent load = null;
                try {
                    load = FXMLLoader.load(resource);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage window = (Stage) deleteBtn.getScene().getWindow();
                window.setScene(new Scene(load));
            }


        });

    }

}
