// Author: Jay Patel, 000881881
import javafx.scene.canvas.GraphicsContext;

// An interface for objects that can be drawn on a GraphicsContext
public interface Drawable {
    void draw(GraphicsContext gc); // draw method to be implemented by classes that implement this interface
}

