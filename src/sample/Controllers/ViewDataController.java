package sample.Controllers;

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ViewDataController {


    @FXML
    public void initialize(){

    }

    public void changeScreenViewDataPageToHomePage(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("/sample/FXML/HomePage.fxml"));
        Scene viewScene = new Scene(viewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(viewScene);
        window.show();
    }

    public void reedFile() {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        File file = new File(s+"/src/sample/data/datos.txt");
        StringBuilder fileContents = new StringBuilder((int)file.length());

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + System.lineSeparator());
            }
            System.out.println(fileContents.toString());
            String doc = fileContents.toString();

            System.out.println(doc.charAt(0));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
