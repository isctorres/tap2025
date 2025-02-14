package com.example.tap2025.vistas;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Stage {

    private Scene escena;
    private TextField txtDisplay;
    private VBox vBox;
    private GridPane gdpTeclado;
    private Button[][] arBtnTeclado;
    String strTeclas[] = {"7","8","9","*","4","5","6","/","1","2","3","+","=","0",".","-"};

    public void CrearUI(){
        CrearKeyboard();
        txtDisplay = new TextField("0");
        //txtDisplay.setPromptText("Teclea tu operación");
        txtDisplay.setEditable(false);
        txtDisplay.setAlignment(Pos.BASELINE_RIGHT);
        vBox = new VBox(txtDisplay,gdpTeclado);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
        escena = new Scene(vBox,200,200);
        escena.getStylesheets().add(getClass().getResource("/styles/calcu.css").toString());
    }

    public void CrearKeyboard(){
        arBtnTeclado = new Button[4][4];
        gdpTeclado = new GridPane();
        gdpTeclado.setHgap(5);
        gdpTeclado.setVgap(5);
        int pos = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arBtnTeclado[i][j] = new Button(strTeclas[pos]);
                if( strTeclas[pos].equals("*") ) {
                    arBtnTeclado[i][j].setId("fontButton");
                    arBtnTeclado[i][j].setStyle("-fx-background-color: rgba(31,107,45,0.72);");
                }
                int finalPos = pos;
                arBtnTeclado[i][j].setOnAction(event -> EventoTeclado(strTeclas[finalPos]));
                arBtnTeclado[i][j].setPrefSize(50,50);
                gdpTeclado.add(arBtnTeclado[i][j],j,i);
                pos++;
            }
        }
    }

    private void EventoTeclado(String strTecla) {

        txtDisplay.appendText(strTecla);

    }

    public Calculadora(){
        CrearUI();
        this.setScene(escena);
        this.setTitle("Calculadora");
        this.show();
    }
}