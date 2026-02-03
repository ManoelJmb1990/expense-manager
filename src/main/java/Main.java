package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.view.MainView;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        MainView view = new MainView();
        Scene scene = new Scene(view.build(), 500, 600);
        stage.setTitle("Gerenciador de Despesas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
