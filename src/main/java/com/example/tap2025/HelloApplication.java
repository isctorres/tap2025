package com.example.tap2025;

import com.example.tap2025.componentes.Hilo;
import com.example.tap2025.modelos.Conexion;
import com.example.tap2025.vistas.Calculadora;
import com.example.tap2025.vistas.ListaClientes;
import com.example.tap2025.vistas.VentasRestaurante;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private VBox vBox;
    private MenuBar mnbPrincipal;
    private Menu menCompentencia1, menCompetencia2;
    private MenuItem mitCalculadora, mitRestaurante;
    private Scene escena;

    void CrearUI(){
        mitCalculadora = new MenuItem("Calculadora");
        mitCalculadora.setOnAction(event -> new Calculadora());
        mitRestaurante = new MenuItem("Restaurante");
        mitRestaurante.setOnAction(event -> new ListaClientes());
        menCompentencia1 = new Menu("Competencia 1");
        menCompentencia1.getItems().addAll(mitCalculadora, mitRestaurante);
        mnbPrincipal = new MenuBar();
        mnbPrincipal.getMenus().addAll(menCompentencia1);
        vBox = new VBox(mnbPrincipal);
        escena = new Scene(vBox);
        escena.getStylesheets().add(getClass().getResource("/styles/main.css").toString());
    }

    @Override
    public void start(Stage stage) throws IOException {

        new Hilo("Ruta Pinos").start();
        new Hilo("Ruta Laureles").start();
        new Hilo("Ruta San Juan de la Vega").start();
        new Hilo("Ruta Monte Blanco").start();
        new Hilo("Ruta Teneria").start();

        Conexion.createConnection();
        CrearUI();
        stage.setTitle("Hola Mundo de Eventos :)");
        stage.setScene(escena);
        stage.show();
        stage.setMaximized(true);
    }

    public static void main(String[] args) {
        launch();
    }
    void clickEvent(){
        System.out.println("Evento desde un metodo :)");
    }
}