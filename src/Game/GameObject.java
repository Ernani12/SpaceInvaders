
package Game;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author Ernani
 */
public abstract class GameObject implements Drawable {

    int xPos;   // desenhar os oBjetos na tela
    int yPos;
    Color color;
    boolean isColliding;
    
    public GameObject(){};
    
    // para qualquer objto tem um construtor
    public GameObject(int xPosition, int yPosition, Color color) {
        this.xPos = xPosition;
        this.yPos = yPosition;
        this.color = color;
    }

    public abstract Rectangle getBounds();// desenhando retangulos

    // Gets the X position of any object
    public int getXPosition() {
        return xPos;
    }

    // Gets the Y position of any object
    public int getYPosition() {
        return yPos;
    }

    // Gets the color of any object
    public Color getColor() {
        return color;
    }

    // Sets the X position of any object
    public void setXPosition(int xPosition) {
        this.xPos = xPosition;
    }

    // Sets the Y position of any object
    public void setYPosition(int yPosition) {
        this.yPos = yPosition;
    }

    // Sets the color of any object
    public void setColor(Color color) {
        this.color = color;
    }

    // Verifica se há alguam coliza entre objetos
    public boolean isColliding(GameObject other) {
        isColliding = other.getBounds().intersects(this.getBounds());
        return isColliding;
    }
}
