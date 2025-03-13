package com.example.tap2025.vistas;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Celayork extends Stage {

    private VBox vBox;
    private GridPane gdpCalles;
    private Button btnIniciar;
    private Label[] lblRutas;
    private ProgressBar[] pgbRutas;

    public  Celayork(){
        this.setTitle("Calles de Celaya");
        this.setScene(escena);
        this.show();
    }
}
