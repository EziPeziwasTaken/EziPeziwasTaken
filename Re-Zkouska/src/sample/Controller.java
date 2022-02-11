package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    Label AhojSvete;
    //@FXML
    //Button hide;
    @FXML
    Button show;
    @FXML
    Button add;
    @FXML
    Label count1;
    @FXML
    Label count2;
    @FXML
    Label scroll;
    @FXML
    Label restart1;
    @FXML
    Label restart2;
    @FXML
    AnchorPane click;

    int pocet1 = 0;
    int pocet2 = 0;

    public void add(MouseEvent event){
        //pocet++;
        //count1.setText(String.valueOf(pocet));

    }
    public void vypis(ActionEvent event) {
        if (AhojSvete.isVisible()) {
            AhojSvete.setVisible(false);
            show.setText("Vypiš!");
            pocet1++;
            count1.setText(String.valueOf(pocet1));


            //hide.setVisible(false);
            //show.setVisible(true);
        } else {
            show.setText("Skryj!");
            AhojSvete.setVisible(true);
            //show.setVisible(false);
            //hide.setVisible(true);
            pocet1++;
            count1.setText(String.valueOf(pocet1));
        }
    }
        public void scroll(ScrollEvent event) {
            pocet2++;

            count2.setText(String.valueOf(pocet2));
        }

        public void restart1(MouseEvent event) {
            pocet1 = 0;
            count1.setText("0");
    }

        public void restart2(MouseEvent event) {
            pocet2 = 0;
            count2.setText("0");
    }

        public void click(MouseEvent event) {
            pocet1++;
            count1.setText(String.valueOf(pocet1));
    }
    }

    /*public void hide(ActionEvent event) {

    }*/

