// Author: Jay Patel, 000881881
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class GeometricObject {
    private double x;
    private double y;
    private Color color;

    // A constructor that takes in the x, y, and color parameters and sets the corresponding instance variables
    public GeometricObject(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // A setter method named setX which takes in a double parameter and sets the x-coordinate of the object
    public void setX(double x) {
        this.x = x;
    }

    // A setter method named setY which takes in a double parameter and sets the y-coordinate of the object
    public void setY(double y) {
        this.y = y;
    }

    // A getter method named getX which returns the x-coordinate of the object
    public double getX() {
        return x;
    }

    // A getter method named getY which returns the y-coordinate of the object
    public double getY() {
        return y;
    }

    // A setter method named setColor which takes in a Color parameter and sets the color of the object
    public void setColor(Color color) {
        this.color = color;
    }

    // A getter method named getColor which returns the color of the object
    public Color getColor() {
        return color;
    }

    // An abstract method named draw which takes in a GraphicsContext parameter and doesn't return anything
    // This method is meant to be implemented by the classes that extend GeometricObject to draw their specific shape using the GraphicsContext parameter
    public abstract void draw(GraphicsContext gc);
}