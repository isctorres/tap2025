package com.example.tap2025.vistas;

import javafx.scene.Scene;
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
    private Scene escena;

    public  Celayork(){
        CrearUI();
        this.setTitle("Calles de Celaya");
        this.setScene(escena);
        this.show();
    }

    private void CrearUI() {
        pgbRutas = new ProgressBar[5];
        lblRutas = new Label[5];
        gdpCalles = new GridPane();
        for (int i = 0; i < pgbRutas.length; i++) {

        }
    }
}
