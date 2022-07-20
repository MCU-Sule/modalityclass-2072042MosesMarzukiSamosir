package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class SecondController {
    public AnchorPane paneView;
    public TextField textNamaMenu;
    public TextField textHargaMenu;
    public Button btnAddMenu;
    public ComboBox cboxDefaultDiscount;
    public Button btnCoustumDiscount;
    private Stage stage;

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }

    public void setHargaMenu(int hargaMenu) {
        this.hargaMenu = hargaMenu;
    }

    private String namaMenu;
    private int hargaMenu;

    private Float discMenu;

    private ThirdController tc;

    public void initialize() throws IOException {
        stage = new Stage();
        FXMLLoader loader;
        loader = new FXMLLoader(com.example.modalityclass2072042mosesmarzukisamosir.Modality.class.getResource("third-page.fxml"));
        Scene scene =  new Scene(loader.load());

        tc = loader.getController();
        stage.setScene(scene);
        stage.setTitle("Add Discount");

        stage.initModality(Modality.APPLICATION_MODAL);
        ObservableList<Float> option =FXCollections.observableArrayList(0.0F,0.1F,0.2F,0.3F,0.4F,0.5F,0.6F,0.7F,0.8F,0.9F);
        cboxDefaultDiscount.setItems(option);
        cboxDefaultDiscount.getSelectionModel().select(0);

    }
    public void toCostumDiscount(ActionEvent event) throws IOException {

        stage.showAndWait();
        Float f = Float.valueOf(tc.getCostumDisc())/100;
        btnCoustumDiscount.setText(String.valueOf(f));
    }

    public void onAddMenu(ActionEvent event) {
        setNamaMenu(textNamaMenu.getText());
        setHargaMenu(Integer.parseInt(textHargaMenu.getText()));

        if (tc == null){
            setDiscMenu((Float) cboxDefaultDiscount.getValue());
        }  else {
            Float f = Float.valueOf(tc.getCostumDisc());
            if (f.equals(null)){
                setDiscMenu(0.0F);
            }else {
                setDiscMenu(f/100);
            }
        }
        btnAddMenu.getScene().getWindow().hide();
        clearField();
    }

    public Float getDiscMenu() {
        return discMenu;
    }

    public void setDiscMenu(Float discMenu) {
        this.discMenu = discMenu;
    }
    public void clearField(){
        textNamaMenu.clear();
        textHargaMenu.clear();
        btnCoustumDiscount.setText("Custom Discount");
        cboxDefaultDiscount.getSelectionModel().select(0);

    }
}
