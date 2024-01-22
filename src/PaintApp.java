// Author: Jay Patel, 000881881
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PaintApp extends Application {

    // The current shape being drawn on the canvas
    private GeometricObject currentShape;
    // The current color selected by the user
    private Color currentColor = Color.BLACK;
    // Buttons to select circle and square shapes
    private Button button1;
    private Button button2;

    public void start(Stage stage) {
        // Create a canvas to draw on
        Canvas canvas = new Canvas(800, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        VBox root = new VBox();
        HBox buttons = new HBox();

        // Create a button to select circle shape
        button1 = new Button("Circle");
        button1.setOnAction(e -> {
            currentShape = new Circle(0, 0, currentColor, 20);
        });

        // Create a button to select square shape
        button2 = new Button("Square");
        button2.setOnAction(e -> {
            currentShape = new Square(0, 0, currentColor, 40);
        });

        // Create a button to clear the canvas
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        });

        // Add the buttons to the HBox
        buttons.getChildren().addAll(button1, button2, clearButton);

        // Create a color picker to select the color
        ColorPicker colorPicker = new ColorPicker(Color.BLACK);
        colorPicker.setOnAction(e -> {
            // Update the current color and the current shape color
            currentColor = colorPicker.getValue();
            currentShape.setColor(currentColor);
            gc.setFill(currentColor);
            currentShape.draw(gc);
        });

        // Add the color picker, canvas and buttons to the VBox
        root.getChildren().addAll(buttons, colorPicker, canvas);

        // Event handlers for the canvas
        canvas.setOnMousePressed(e -> {
            currentShape.draw(gc);
            currentShape.setX(e.getX());
            currentShape.setY(e.getY());
        });

        canvas.setOnMouseDragged(e -> {
            currentShape.draw(gc);
            currentShape.setX(e.getX());
            currentShape.setY(e.getY());
        });

        canvas.setOnMouseReleased(e -> {
            currentShape.draw(gc);
        });

        // Create the scene and set it to the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
