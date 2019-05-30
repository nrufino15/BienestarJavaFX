package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML public ImageView E1, E2, E3, E4, E5;
    @FXML public ImageView F1, F2, F3, F4, F5;

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 700, 500));
//        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
