package chapter34;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DirectDrawDemo extends Application {
    GraphicsContext gc;
    Color[] colors = {Color.GREEN, Color.BLUE, Color.RED, Color.BLACK};
    int colorIDx = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Draw directly to a Canvas.");

        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 450, 450);

        primaryStage.setScene(myScene);

        Canvas myCanvas = new Canvas(400,400);

        gc = myCanvas.getGraphicsContext2D();

        Button btnChangeColor = new Button("Change color.");

        btnChangeColor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gc.setStroke(colors[colorIDx]);
                gc.setFill(colors[colorIDx]);
                gc.strokeLine(0,0,200,200);
                gc.fillText("This is drawn on the Canvas.", 60, 50);
                gc.fillRect(100, 320, 300, 40);

                colorIDx++;

                if(colorIDx == colors.length)
                    colorIDx = 0;
            }
        });

        gc.strokeLine(0,0,200,200);
        gc.strokeOval(100,100,200,200);
        gc.strokeRect(0,200,50,200);
        gc.fillOval(0,0,20,20);
        gc.fillRect(100,320,300,40);

        gc.setFont(new Font(20));
        gc.fillText("This is drawn on the Canvas.", 60, 50);

        rootNode.getChildren().addAll(myCanvas, btnChangeColor);

        primaryStage.show();
    }
}
