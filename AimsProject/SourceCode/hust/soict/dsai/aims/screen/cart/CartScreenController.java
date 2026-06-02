package hust.soict.dsai.aims.screen.cart;  

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert;

public class CartScreenController {
private Cart cart;

@FXML
private Button btnPlay;

@FXML
private Button btnRemove;

@FXML
private TableColumn<Media, String> colMediaCategory;

@FXML
private TableColumn<Media, Float> colMediaCost;

@FXML
private TableColumn<Media, String> colMediaTitle;

@FXML
private ToggleGroup filterCategory;

@FXML
private TableView<Media> tblMedia;

public CartScreenController(Cart cart) {
    super();
    this.cart = cart;
}

@FXML
private void initialize() {
    colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
    colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
    colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
    
    if (cart != null && cart.getItemsOrdered() != null) {
        tblMedia.setItems(cart.getItemsOrdered());
    }

    btnPlay.setVisible(false);
    btnRemove.setVisible(false);
    btnRemove.setOnAction(this::btnRemovePressed);
    btnPlay.setOnAction(this::btnPlayPressed);

    tblMedia.getSelectionModel().selectedItemProperty().addListener(
        new ChangeListener<Media>() {
            @Override
            public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                if (newValue != null) {
                    updateButtonBar(newValue);
                }
            }
        }
    );
}

void updateButtonBar(Media media) {
    btnRemove.setVisible(true);
    if (media instanceof Playable) {
        btnPlay.setVisible(true);
    } else {
        btnPlay.setVisible(false);
    }
}
@FXML
void btnRemovePressed(ActionEvent event) {
Media media = tblMedia.getSelectionModel().getSelectedItem();
cart.removeMedia(media);
}

@FXML
void btnPlayPressed(ActionEvent event) {
Media media = tblMedia.getSelectionModel().getSelectedItem();
Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("play media");
alert.setHeaderText("playing " + media.getTitle());
alert.setContentText("media is playing now...");
alert.showAndWait();
}
}