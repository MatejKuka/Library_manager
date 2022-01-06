package GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
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
    private MenuItem closeMenuItem, normalView;


    @FXML
    void toCloseNewScene(ActionEvent event) {
        Stage stage = (Stage) closeNewScenebutton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void toNormalView(ActionEvent event) {
        Stage stage = (Stage) closeNewScenebutton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void toCloseGalleryView(ActionEvent event) {
            System.exit(0);
    }
}
