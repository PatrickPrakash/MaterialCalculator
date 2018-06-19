package JavaCalc;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    int calcode = 0;
    float fnum = 0;

    @FXML
    private JFXButton btnadd;

    @FXML
    private JFXButton btnthree;

    @FXML
    private JFXButton btntwo;

    @FXML
    private JFXButton btnfour;

    @FXML
    private JFXButton btnsub;

    @FXML
    private JFXButton btnsix;

    @FXML
    private JFXButton btnfive;

    @FXML
    private JFXButton btnseven;

    @FXML
    private JFXButton btnmul;

    @FXML
    private JFXButton btnnine;

    @FXML
    private JFXButton btneight;

    @FXML
    private JFXButton btnone;

    @FXML
    private JFXButton btnzero;

    @FXML
    private JFXButton btnequal;

    @FXML
    private JFXButton btndivide;

    @FXML
    private TextArea resulttext;

    @FXML
    private JFXButton btnclr;

    @FXML
    void btnaddaction(ActionEvent event) {
        fnum = Float.parseFloat(resulttext.getText());
        calcode = 1; //Code for Addition
        resulttext.setText("");
    }

    @FXML
    void btnsubaction(ActionEvent event) {
        fnum = Float.parseFloat(resulttext.getText());
        calcode = 2; //Code for Subtraction
        resulttext.setText("");
    }

    @FXML
    void btnmulaction(ActionEvent event) {
        fnum = Float.parseFloat(resulttext.getText());
        calcode = 3; //Code for Multiplication
        resulttext.setText("");

    }
    @FXML
    void btndivideaction(ActionEvent event) {
        fnum = Float.parseFloat(resulttext.getText());
        calcode = 4; //Code for Division
        resulttext.setText("");

    }


    @FXML
    void btnnumaction(ActionEvent event) {
        //Listens all the Number button Clicks & Clear Button

        if (event.getSource() == btnone) {
            resulttext.setText(resulttext.getText() + "1");
        } else if (event.getSource() == btntwo) {
            resulttext.setText(resulttext.getText() + "2");
        } else if (event.getSource() == btnthree) {
            resulttext.setText(resulttext.getText() + "3");
        } else if (event.getSource() == btnfour) {
            resulttext.setText(resulttext.getText() + "4");
        } else if (event.getSource() == btnfive) {
            resulttext.setText(resulttext.getText() + "5");
        } else if (event.getSource() == btnsix) {
            resulttext.setText(resulttext.getText() + "6");
        } else if (event.getSource() == btnseven) {
            resulttext.setText(resulttext.getText() + "7");
        } else if (event.getSource() == btneight) {
            resulttext.setText(resulttext.getText() + "8");
        } else if (event.getSource() == btnnine) {
            resulttext.setText(resulttext.getText() + "9");
        } else if (event.getSource() == btnzero) {
            resulttext.setText(resulttext.getText() + "0");
        } else if (event.getSource() == btnclr) {
            resulttext.setText("");
        }

    }

        @FXML
        void btnequalaction(ActionEvent event)
        {
                float snum = Float.parseFloat(resulttext.getText());
                float result;
                if(calcode == 1)
                {
                    result = fnum + snum;
                    resulttext.setText(String.valueOf(result));
                }
                else if(calcode == 2)
                {
                    result = fnum - snum;
                    resulttext.setText(String.valueOf(result));
                }
                else if(calcode == 3)
                {
                    result = fnum * snum;
                    resulttext.setText(String.valueOf(result));
                }
                else if(calcode == 4)
                {
                    result = fnum / snum;
                    resulttext.setText(String.valueOf(result));
                }
        }



}
