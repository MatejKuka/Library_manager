package GUI.Controllers;

import BE.Book;
import GUI.Models.BookModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
        @FXML
        private TableColumn<Book, String> columnAuthor;

        @FXML
        private TableColumn<Book, String> columnAuthorW;

        @FXML
        private TableColumn<Book, String> columnCategory;

        @FXML
        private TableColumn<Book, String> columnName;

        @FXML
        private TableColumn<Book, String> columnNameW;

        @FXML
        private TableColumn<Book, Integer> columnYear;

        @FXML
        private TableView<Book> tableViewWishList;

        @FXML
        private TableView<Book> tableViewBook;

        @FXML
        private Label descriptionBookShow;

        @FXML
        private ImageView imageViewBookShow;

        @FXML
        private Label nameBookShow;

        @FXML
        private Label YearBookShow;

        @FXML
        private Label authorBookShow;

        @FXML
        private MenuItem galleryView;

        @FXML
        private MenuItem addBookMItem;

        @FXML
        private MenuItem deleteBookMItem;

        @FXML
        private MenuItem closeSystemMI;


        private Parent root;
        private BookModel modelBook;
        private Book chosenBook;

        @Override
        public void initialize(URL location, ResourceBundle resources) {
        modelBook = modelBook.getInstance();
        setTableView();
        setTableViewWishList();
        }

        @FXML
        void IntoWishList(ActionEvent event) {
                Book bookToAdd = tableViewBook.getSelectionModel().getSelectedItem();
                modelBook.addBookToWishList(bookToAdd);
        }

        @FXML
        void toAddBookMenu(ActionEvent event) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/GUI/Views/NewBookView.fxml"));
                try {
                        root = loader.load();
                } catch (IOException e) {}
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
        }
        @FXML
        void toCloseSystemM(ActionEvent event) {System.exit(0);}

        @FXML
        void toDeleteBookM(ActionEvent event) {
                Book bookToDelete = tableViewBook.getSelectionModel().getSelectedItem();
                modelBook.deleteBook(bookToDelete);
        }

        @FXML
        void toDeleteFromWishList(ActionEvent event) {
                Book bookFromWishList = tableViewWishList.getSelectionModel().getSelectedItem();
                modelBook.removeBookFromWishList(bookFromWishList);
        }


        public void setTableView(){
                columnAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
                columnCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
                columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
                columnYear.setCellValueFactory(new PropertyValueFactory<>("year"));
                tableViewBook.setItems(modelBook.getAllBooks());
        }

        private void setTableViewWishList(){
                columnAuthorW.setCellValueFactory(new PropertyValueFactory<>("author"));
                columnNameW.setCellValueFactory(new PropertyValueFactory<>("name"));
                tableViewWishList.setItems(modelBook.getObservableWishList());
        }

        public void toShowCurrentBook(javafx.scene.input.MouseEvent mouseEvent) {
                chosenBook = tableViewBook.getSelectionModel().getSelectedItem();
                authorBookShow.setText(chosenBook.getAuthor());
                nameBookShow.setText(chosenBook.getName());
                YearBookShow.setText(String.valueOf(chosenBook.getYear()));
                imageViewBookShow.setImage(chosenBook.getImage());
        }

        @FXML
        void toGalleryView(ActionEvent event) throws IOException {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/GUI/Views/NewUIView.fxml"));
                stage.setTitle("LibraryManager");
                stage.setScene(new Scene(root));
                stage.show();

        }//TODO how to close current stage?


}
