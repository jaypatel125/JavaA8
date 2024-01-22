// Author: Jay Patel, 000881881
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends GeometricObject {
    private double size;

    // Constructor takes in x and y coordinates, color, and size of square
    public Square(double x, double y, Color color, double size) {
        super(x, y, color); // Call super constructor to initialize x, y, and color
        this.size = size; // Initialize size of square
    }

    // Override the draw method from GeometricObject to draw a square
    @Override
    public void draw(GraphicsContext gc) {
        // Fill a rectangle at (x - size/2, y - size/2) with size x size dimensions
        gc.fillRect(getX() - size / 2, getY() - size / 2, size, size);
    }
}
