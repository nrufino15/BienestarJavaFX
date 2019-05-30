package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML public ImageView E1, E2, E3, E4, E5, F1, F2, F3, F4, F5;

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

    public void changeSceenSelectInputPageToInputMorning(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("InputMorning.fxml"));
        Scene viewScene = new Scene(viewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(viewScene);
        window.show();
    }

    public void ratingBar() {

        System.out.println("CLICKED");

        E1.addEventHandler(MouseEvent.MOUSE_CLICKED, event1 -> E1.setImage(new Image("sample/img/selected-star.png")));

        E2.addEventHandler(MouseEvent.MOUSE_CLICKED, event12 -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
        });

        E3.addEventHandler(MouseEvent.MOUSE_CLICKED, event12 -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
            E3.setImage(new Image("sample/img/selected-star.png"));
        });

        E4.addEventHandler(MouseEvent.MOUSE_CLICKED, event12 -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
            E3.setImage(new Image("sample/img/selected-star.png"));
            E4.setImage(new Image("sample/img/selected-star.png"));
        });

        E5.addEventHandler(MouseEvent.MOUSE_CLICKED, event12 -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
            E3.setImage(new Image("sample/img/selected-star.png"));
            E4.setImage(new Image("sample/img/selected-star.png"));
            E5.setImage(new Image("sample/img/selected-star.png"));
        });

        F1.addEventHandler(MouseEvent.MOUSE_CLICKED, event1 -> F1.setImage(new Image("sample/img/selected-star.png")));

        F2.addEventHandler(MouseEvent.MOUSE_CLICKED, event12 -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            F2.setImage(new Image("sample/img/selected-star.png"));
        });

        F3.addEventHandler(MouseEvent.MOUSE_CLICKED, event12 -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
            F3.setImage(new Image("sample/img/selected-star.png"));
        });

        F4.addEventHandler(MouseEvent.MOUSE_CLICKED, event12 -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            F2.setImage(new Image("sample/img/selected-star.png"));
            F3.setImage(new Image("sample/img/selected-star.png"));
            F4.setImage(new Image("sample/img/selected-star.png"));
        });

        F5.addEventHandler(MouseEvent.MOUSE_CLICKED, event12 -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            F2.setImage(new Image("sample/img/selected-star.png"));
            F3.setImage(new Image("sample/img/selected-star.png"));
            F4.setImage(new Image("sample/img/selected-star.png"));
            F5.setImage(new Image("sample/img/selected-star.png"));
        });







    }


}
