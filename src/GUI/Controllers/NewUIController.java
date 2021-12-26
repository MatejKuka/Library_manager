package GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class NewUIController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private Button closeNewScenebutton;


    @FXML
    void toCloseNewScene(ActionEvent event) {
        Stage stage = (Stage) closeNewScenebutton.getScene().getWindow();
        stage.close();
    }


}
