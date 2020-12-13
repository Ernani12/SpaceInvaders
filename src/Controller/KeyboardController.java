
package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Ernani
 
 Em nossa segunda seção iremos aprender sobre o uso de outro listener, o KeyListener.
 * Utilizado para “ouvir” eventos que são disparados pelo pressionamento, 
 * liberação ou digitação de uma tecla qualquer, em resumo: O uso do teclado.
  
 * 
 * 
 * 
 * 
 */
public class KeyboardController implements KeyListener
{
    private boolean[] keyStatus; 
    
    public KeyboardController()
    {
        keyStatus = new boolean[256]; 
    }
    
    public boolean getKeyStatus(int keyCode)
    {
        if(keyCode < 0 || keyCode > 255)
        {
            return false; 
        }
        else
        {
            return keyStatus[keyCode]; 
        }
    }
    
    public void resetController()
    {
        keyStatus = new boolean[256]; 
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keyStatus[ke.getKeyCode()] = true; 
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keyStatus[ke.getKeyCode()] = false; 
    }
    
}
