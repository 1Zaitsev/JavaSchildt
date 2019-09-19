package chapter34;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;


public class JavaFXSkel extends Application {

    public static void main(String[] args) {
        System.out.println("Запуск JavaFX-приложения.");

        launch(args);
    }

    @Override
    public void init() {
        System.out.println("В теле метода init().");
    }

    @Override
    public void start(Stage myStage) {
        System.out.println("В теле метода start().");
        myStage.setTitle("JavaFX Skeleton.");

        FlowPane rootNode = new FlowPane();

        Scene myScene = new Scene(rootNode,300,200);

        myStage.setScene(myScene);
        myStage.show();
    }

    @Override
    public void stop() {
        System.out.println("В теле stop().");
    }
}
