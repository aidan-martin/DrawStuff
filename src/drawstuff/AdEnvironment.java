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
public class AdEnvironment extends Environment {

    Image logo;

    public AdEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/blue_apple_logo_by_rick_c.png");
        this.setBackground(Color.white);
    }

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
        graphics.setColor(new Color(64, 224, 208, 78));
        graphics.fillOval(40, -50, 90, 90);
        graphics.setColor(new Color(147, 112, 219, 98));
        graphics.fillOval(110, 100, 90, 90);
        graphics.setColor(new Color(240, 128, 128, 98));
        graphics.fillOval(200, 400, 90, 90);
        graphics.setColor(new Color(154, 205, 50, 80));
        graphics.fillOval(300, 300, 90, 90);
        graphics.setColor(new Color(247, 181, 57, 95));
        graphics.fillOval(700, 500, 90, 90);
        graphics.setColor(new Color(154, 205, 50, 80));
        graphics.fillOval(478, 200, 90, 90);
        graphics.setColor(new Color(64, 224, 208, 90));
        graphics.fillOval(600, 126, 90, 90);
        graphics.setColor(new Color(147, 112, 219, 98));
        graphics.fillOval(500, 540, 90, 90);
        graphics.setColor(new Color(255, 192, 203, 99));
        graphics.fillOval(80, 300, 90, 90);
        graphics.setColor(new Color(255, 192, 203, 99));
        graphics.fillOval(820, 380, 90, 90);
        graphics.setColor(new Color(255, 192, 203, 99));
        graphics.fillOval(300, 100, 90, 90);
        graphics.setColor(new Color(64, 224, 208, 90));
        graphics.fillOval(370, 200, 90, 90);
        graphics.setColor(new Color(247, 181, 57, 95));
        graphics.fillOval(400, 300, 90, 90);
        graphics.setColor(new Color(147, 112, 219, 98));
        graphics.fillOval(500, 70, 90, 90);
        graphics.setColor(new Color(64, 224, 208, 90));
        graphics.fillOval(400, 370, 90, 90);
        graphics.setColor(new Color(255, 192, 203, 99));
        graphics.fillOval(400, 200, 90, 90);
        graphics.setColor(new Color(154, 205, 50, 80));
        graphics.fillOval(600, 430, 90, 90);
        graphics.setColor(new Color(247, 181, 57, 95));
        graphics.fillOval(800, 300, 90, 90);
        graphics.setColor(new Color(147, 112, 219, 98));
        graphics.fillOval(500, 270, 90, 90);
        graphics.fillOval(600, 350, 90, 90);
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Avenir", Font.BOLD, 45));
        graphics.drawString("Forward Thinking.", 260, 480);

        if (logo != null) {
            graphics.drawImage(logo, 379, 210, 130, 157, this);
        }

    }
}
