
package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javafx.scene.shape.Ellipse;
import javax.swing.ImageIcon;

/**
 *
 * @author Ernani
 */
public class Beam extends MovingGameObject {

    //Enemies shoot beams
    // constructor for beam
    public Beam(int xPosition, int yPosition, int diameter, Color color) {
        super(xPosition, yPosition, 0, 0, color);
    }
    
// Used to draw a beam
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(this.getXPosition(), this.getYPosition(), 7, 15);
    }
    
    // Used to get the hit box of a beam sabse- se  cad imagem tem seus Bounds, posicoes /tamanhso para colidir
    @Override
    public Rectangle getBounds() {
        Rectangle beamHitbox = new Rectangle(xPos, yPos, 7, 15);
        return beamHitbox;
    }
}
