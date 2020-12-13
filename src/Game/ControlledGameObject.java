
package Game;

import Controller.KeyboardController;
import java.awt.Color;

/**
 *
 * @author Ernani  definiçao de controle do game Teclado Keyboard
 */
public abstract class ControlledGameObject extends GameObject implements Moveable {
    
    KeyboardController control;
    
    
    /*
    Fundamental para qualquer jogo é interagir com um jogador. O teclado é uma maneira de o jogador controlar o jogo.
    É apropriado que cada vez que seu código atualiza o display ele verifica qualquer atividade do teclado. 
    Se houve alguma atividade do teclado, então leia as teclas que foram pressionadas.
      O codigo da table a AsCII table  tem para cada tecla é passado de forma mais facil
    quando pressionar
    
    */
    
    
    // Constructor for any controllable object
    public ControlledGameObject(int xPosition, int yPosition, Color color, KeyboardController control)
    {
        super(xPosition, yPosition, color);
        this.control = control;
    }
}
