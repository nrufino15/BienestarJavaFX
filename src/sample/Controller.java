package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML public ImageView E1, E2, E3, E4, E5, F1, F2, F3, F4, F5;
    @FXML public Label P1, P2;

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

        E1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/unselected-star.png"));
            E3.setImage(new Image("sample/img/unselected-star.png"));
            E4.setImage(new Image("sample/img/unselected-star.png"));
            E5.setImage(new Image("sample/img/unselected-star.png"));
            P1.setText("1");
            event.consume();
        });

        E2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
            E3.setImage(new Image("sample/img/unselected-star.png"));
            E4.setImage(new Image("sample/img/unselected-star.png"));
            E5.setImage(new Image("sample/img/unselected-star.png"));
            P1.setText("2");
            event.consume();
        });

        E3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
            E3.setImage(new Image("sample/img/selected-star.png"));
            E4.setImage(new Image("sample/img/unselected-star.png"));
            E5.setImage(new Image("sample/img/unselected-star.png"));
            P1.setText("3");
            event.consume();
        });

        E4.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
            E3.setImage(new Image("sample/img/selected-star.png"));
            E4.setImage(new Image("sample/img/selected-star.png"));
            E5.setImage(new Image("sample/img/unselected-star.png"));
            P1.setText("4");
            event.consume();
        });

        E5.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            E1.setImage(new Image("sample/img/selected-star.png"));
            E2.setImage(new Image("sample/img/selected-star.png"));
            E3.setImage(new Image("sample/img/selected-star.png"));
            E4.setImage(new Image("sample/img/selected-star.png"));
            E5.setImage(new Image("sample/img/selected-star.png"));
            P1.setText("5");
            event.consume();
        });

        F1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            F2.setImage(new Image("sample/img/unselected-star.png"));
            F3.setImage(new Image("sample/img/unselected-star.png"));
            F4.setImage(new Image("sample/img/unselected-star.png"));
            F5.setImage(new Image("sample/img/unselected-star.png"));
            P2.setText("1");
            event.consume();
        });

        F2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            F2.setImage(new Image("sample/img/selected-star.png"));
            F3.setImage(new Image("sample/img/unselected-star.png"));
            F4.setImage(new Image("sample/img/unselected-star.png"));
            F5.setImage(new Image("sample/img/unselected-star.png"));
            P2.setText("2");
            event.consume();
        });

        F3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            F2.setImage(new Image("sample/img/selected-star.png"));
            F3.setImage(new Image("sample/img/selected-star.png"));
            F4.setImage(new Image("sample/img/unselected-star.png"));
            F5.setImage(new Image("sample/img/unselected-star.png"));
            P2.setText("3");
            event.consume();
        });

        F4.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            F2.setImage(new Image("sample/img/selected-star.png"));
            F3.setImage(new Image("sample/img/selected-star.png"));
            F4.setImage(new Image("sample/img/selected-star.png"));
            F5.setImage(new Image("sample/img/unselected-star.png"));
            P2.setText("4");
            event.consume();
        });

        F5.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            F1.setImage(new Image("sample/img/selected-star.png"));
            F2.setImage(new Image("sample/img/selected-star.png"));
            F3.setImage(new Image("sample/img/selected-star.png"));
            F4.setImage(new Image("sample/img/selected-star.png"));
            F5.setImage(new Image("sample/img/selected-star.png"));
            P2.setText("5");
            event.consume();
        });
    }
}
