
package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Ernani
 */
public class Enemy extends MovingGameObject {

    ImageIcon alien1 = new ImageIcon("images/alien1Skin.gif");
    ImageIcon alien2 = new ImageIcon("images/alien2Skin.gif");
    ImageIcon alien3 = new ImageIcon("images/alien3Skin.gif");
    ImageIcon alienBoss = new ImageIcon("images/boss1.gif");
    ImageIcon alienBoss2 = new ImageIcon("images/boss2.gif");
    ImageIcon alienBoss3 = new ImageIcon("images/boss3.gif");
    
    private int enemytype, width, height;

    
    // contrutor  para mover o enimigo   velocidade, inteiro
    public Enemy(int xPosition, int yPosition, int xVelocity, int yVelocity, int enemyType, Color color, int width, int height) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.enemytype = enemyType;
        this.width = width;
        this.height = height;
    }
    
    @Override
    // Desenha o alien com variancia de posicao
    public void draw(Graphics g) {
        // Varient 1
        if (this.enemytype % 3 == 0) {
            alien1.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Varient 2
        } else if (this.enemytype % 3 == 1 && this.enemytype != 100) {
            alien2.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Varient 3
        } else if (this.enemytype % 3 == 2) {
            alien3.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Boss Enemy
        } if (this.enemytype == 100)
        {
            if(GamePanel.getBossHealth()>20){
                alienBoss.paintIcon(null, g, this.getXPosition(), this.getYPosition());
            }
            else if(GamePanel.getBossHealth()>10){
                alienBoss2.paintIcon(null, g, this.getXPosition(), this.getYPosition());
            }
            else if(GamePanel.getBossHealth()>0){
                alienBoss3.paintIcon(null, g, this.getXPosition(), this.getYPosition());
            }
        }
    }

    // quando acerta os inimigos pega posicao
    @Override
    public Rectangle getBounds() {
        Rectangle enemyHitBox = new Rectangle(this.getXPosition(), this.getYPosition(), width, height);
        return enemyHitBox;
    }

    // Used to move all enemies move -se na horizontal cada enimigo
    @Override
    public void move() {
        xPos += xVel;
    }

}
