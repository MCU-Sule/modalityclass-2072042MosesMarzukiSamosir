package controller;

import com.example.modalityclass2072042mosesmarzukisamosir.Modality;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import model.Menu;

import java.io.IOException;

public class FirstController {

    public ListView listView;

    private Stage stage;

    ObservableList<Menu> olist;

    SecondController sc ;



    public void initialize() throws IOException {
        stage = new Stage();
        FXMLLoader loader;
        loader = new FXMLLoader(Modality.class.getResource("second-page.fxml"));
        Scene scene =  new Scene(loader.load());

        stage.initModality(javafx.stage.Modality.APPLICATION_MODAL);
        stage.setTitle("Add Menu");
        stage.setScene(scene);

        sc = loader.getController();

        olist = FXCollections.observableArrayList(new Menu("Expresso", 50000, 0.2f));
        listView.setItems(olist);


    }

    public void toSecondPage(ActionEvent event) {
        stage.showAndWait();
        Menu menu = new Menu(sc.getNamaMenu(), sc.getHargaMenu(), sc.getDiscMenu() );
        olist.add(menu);
    }
}