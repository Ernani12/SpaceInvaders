
package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author @author Ernani
 */
public class Bullet extends MovingGameObject {

    // Tiro  e controle da bala da nave
    int diameter;
    int yVelocity;

    // contrutor
    public Bullet(int xPosition, int yPosition, int diameter, Color color) {
        super(xPosition, yPosition, 0, 0, color);
        this.diameter = diameter;
    }

    // pega diametro da bala
    public int getDiameter() {
        return diameter;
    }

    // desenha a bala
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(this.getXPosition(), this.getYPosition(), 7, 15);

    }

    @Override
    public Rectangle getBounds() {
        Rectangle bulletHitbox = new Rectangle(xPos, yPos, 7, 15);
        return bulletHitbox;
    }
}
