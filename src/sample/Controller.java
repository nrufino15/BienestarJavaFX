package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {


    public void changeSceenHomePageToSelectInputPage(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("SelectInputPage.fxml"));
        Scene viewScene = new Scene(viewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(viewScene);
        window.show();
    }

    public void changeSceenSelectInputPageToHomePage(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene viewScene = new Scene(viewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(viewScene);
        window.show();
    }
}
