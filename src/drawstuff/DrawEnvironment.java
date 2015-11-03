/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author aidanmartin
 */
class DrawEnvironment extends Environment {

    public DrawEnvironment() {
//                logo = ResourceTools.loadImageFromResource("drawstuff/white-apple-logo-on-black-background-md.png");
                this.setBackground(Color.white);

    }
    
    Image logo;
    

    @Override
    public void initializeEnvironment() {
    }
    

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawOval(100, 150, 200, 200);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(250, 150, 200, 200);
        graphics.setColor(Color.RED);
        graphics.drawOval(400, 150, 200, 200);
        graphics.setColor(Color.YELLOW);
        graphics.drawOval(200, 250, 200, 200);
        graphics.setColor(Color.GREEN);
        graphics.drawOval(350, 250, 200, 200);
        graphics.setColor(new Color(147,112,219, 32));
        graphics.fillOval(700, 359, 68, 89);
        
        graphics.fillRect(10, 10, 40, 50);
//        graphics.setColor(new Color(128,0,0));
//        graphics.fillOval(100, 150, 200, 200);
//        graphics.fillOval(250, 150, 200, 200);
//        graphics.fillOval(178, 250, 200, 200);
        graphics.setColor(Color.MAGENTA);
        graphics.setFont(new Font("Helvetica Neue Light", Font.PLAIN, 32));
        graphics.drawString("I love cats.", 200, 400);
        
        if (logo != null) {
            graphics.drawImage(logo, 600, 200, this);
        }
    }
    
}
