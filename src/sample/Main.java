package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


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
