package GUI.Controllers;

import BE.Book;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ItemBookController {

    @FXML
    private ImageView iconToWishlist;

    @FXML
    private ImageView imageViewItem;

    @FXML
    private AnchorPane itemBook;

    @FXML
    private Label labelNameBook;

    public void setData(Book book){
        Image image = new Image(book.getImage().getUrl());
        imageViewItem.setImage(image);
        labelNameBook.setText(book.getName());
    }

    @FXML
    void toWishList(MouseEvent event) {

    }
}
