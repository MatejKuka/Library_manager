package GUI.Controllers;

import BE.Book;
import BE.Category;
import GUI.Models.BookModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewBookController implements Initializable {

    @FXML
    private ChoiceBox<Category> choiceBoxCategory;

    @FXML
    private TextField textFieldAuthor;

    @FXML
    private ImageView chosenImageBook;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextField textFieldYear;

    @FXML
    private Button buttonCancel, buttonSave, chooseFileButton;

    private BookModel modelBook = BookModel.getInstance();
    private MainController controller;
    File imageFile;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBoxCategory.getItems().addAll(modelBook.getEnumList());
        }

    @FXML
    void toCancelWindow(ActionEvent event) {
        Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    void toChooseImageFromFile(ActionEvent event) throws IOException {
        if(event.getSource()==chooseFileButton){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                imageFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
            }

        }
    }

    @FXML
    void toSaveBook(ActionEvent event) {
        modelBook.createBook(new Book(textFieldName.getText(), textFieldAuthor.getText(),choiceBoxCategory.getSelectionModel().getSelectedItem(),Integer.parseInt(textFieldYear.getText()), new Image(String.valueOf(imageFile))));
        Stage stage = (Stage) buttonSave.getScene().getWindow();
        stage.close();
    }

}
