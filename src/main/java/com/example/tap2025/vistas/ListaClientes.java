package com.example.tap2025.vistas;

import com.example.tap2025.modelos.ClientesDAO;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListaClientes extends Stage {

    private ToolBar tlbMenu;
    private TableView<ClientesDAO> tbvClientes;
    private VBox vBox;
    private Scene escena;
    public ListaClientes(){
        CrearUI();
        this.setTitle("Listado de Clientes :)");
        this.setScene(escena);
        this.show();
    }

    private void CrearUI() {
        tlbMenu = new ToolBar();
        tbvClientes = new TableView<>();
        vBox = new VBox(tlbMenu,tbvClientes);
        escena = new Scene(vBox, 800, 600);
    }
}
