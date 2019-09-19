package chapter34;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class JavaFXEventDemo extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        myStage.setTitle("JavaFX event");
        myStage.setTitle("Demonstrate JavaFX Buttons and Events.");

        FlowPane rootNode = new FlowPane(10,10);
         rootNode.setAlignment(Pos.CENTER);

         Scene myScene = new Scene(rootNode, 300,100);

         myStage.setScene(myScene);

         response = new Label("Press a button.");

         Button btnAlpha = new Button("Alpha");
         Button btnBeta = new Button("Beta");

         btnAlpha.setOnAction((e) -> response.setText("Alpha was pressed."));

         btnBeta.setOnAction((e) -> response.setText("Beta was pressed."));

         rootNode.getChildren().addAll(btnAlpha, btnBeta, response);

         myStage.show();
    }
}
