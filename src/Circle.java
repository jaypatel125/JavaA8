// Author: Jay Patel, 000881881
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(double x, double y, Color color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    // Overrides the draw method of GeometricObject and draws a circle
    @Override
    public void draw(GraphicsContext gc) {
        gc.fillOval(getX() - radius, getY() - radius, radius * 2, radius * 2);
    }
}
