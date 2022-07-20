package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ThirdController {
    public AnchorPane paneView;
    public TextField txtDiscount;
    public Button btnAddDisc;

    public String getCostumDisc() {
        return CostumDisc;
    }

    public void setCostumDisc(String  costumDisc) {
        CostumDisc = costumDisc;
    }

    private String CostumDisc = String.valueOf(0.0f);

    public void onAddDiscount(ActionEvent event) {
        setCostumDisc(txtDiscount.getText());

        System.out.println(getCostumDisc());
        btnAddDisc.getScene().getWindow().hide();

    }
}
