package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    public void changeScreenHomePageToSelectInputPage(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("/sample/FXML/SelectInputPage.fxml"));
        Scene viewScene = new Scene(viewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(viewScene);
        window.show();
    }

    public void changeScreenHomePageToViewDataPage(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("/sample/FXML/ViewDataPage.fxml"));
        Scene viewScene = new Scene(viewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(viewScene);
        window.show();
    }
}
