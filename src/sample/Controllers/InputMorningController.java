package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class InputMorningController {
    @FXML private ImageView E1, E2, E3, E4, E5, F1, F2, F3, F4, F5;
    @FXML private Label P1, P2;
    @FXML private ChoiceBox<String> choiceBox;
    private ObservableList<String> foodList = FXCollections
            .observableArrayList("Leche", "Cereales", "Pasta", "Fruta", "Vegetales", "Legumbres", "Agua", "Alcohol", "Sumos");

    @FXML
    public void initialize(){
        choiceBox.setValue("Leche");
        choiceBox.setItems(foodList);
    }

    public void ratingBar() {

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

    public void changeScreenInputMorningPageToSelectInputPage(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("/sample/FXML/SelectInputPage.fxml"));
        Scene viewScene = new Scene(viewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(viewScene);
        window.show();
    }

    public void guardarDatos() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Datos> datos = new ArrayList<>();
        datos.add(new Datos(P1.getText(), P2.getText(), choiceBox.getValue()));
        datos.add(new Datos(P1.getText(), P1.getText(), choiceBox.getValue()));
        datos.add(new Datos(P1.getText(), P1.getText(), choiceBox.getValue()));

        FileOutputStream fout =new FileOutputStream("C:\\Users\\nicky\\Desktop\\output.txt");
        ObjectOutputStream out= new ObjectOutputStream(fout);
        out.writeObject(datos);
        out.close();

        //Muestra los datos en consola
//        FileInputStream fin = new FileInputStream("C:\\Users\\nicky\\Desktop\\output.txt");
//        ObjectInputStream ois = new ObjectInputStream(fin);
//        ArrayList<Datos> datos2 = (ArrayList<Datos>)ois.readObject();
//        for(Datos employee : datos2) System.out.println(employee);
    }
}
