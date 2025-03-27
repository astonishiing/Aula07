package apresentacao;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class Painel extends JPanel {

    /**
     *
     */

    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g){
        g.drawLine(100, 100, 200, 200);
        g.drawRect(100, 300, 300, 300);
        g.setColor(Color.red);
        g.fillRect(500, 350, 200, 200);

        //Ceu
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 1024, 500);

        //Chão
        g.setColor(Color.green);
        g.fillRect(0, 500, 1024, 500);

        //Sol
        g.setColor(Color.orange);
        g.fillOval(850, 50, 120, 120);
        g.setColor(Color.yellow);
        g.fillOval(870, 70, 80, 80);

        //Frente da casa
        g.setColor(Color.black);
        g.drawRect(100, 580, 50, 100);

        //Telhado da frente da casa
        g.drawLine(100, 580, 125, 530);
        g.drawLine(150, 580, 125, 530);

        //Lateral da casa
        g.drawLine(150, 680, 300, 630);
        g.drawLine(150, 530, 300, 630);
        g.drawLine(150, 580, 300, 530 );

        //Telhado
        g.drawLine(300, 530, 270, 490);
        g.drawLine(125, 530, 270, 490);

        //Boneco Cabeçudo
        g.setColor(Color.red);
        g.fillOval(650, 600, 20, 20);
        g.drawLine(630, 630, 690, 630); // Braço
        g.drawLine(660, 620, 660, 670); // Tronco
        g.drawLine(660, 670, 630, 700); //Perna direita

        g.drawLine(660, 670, 690, 700); //Perna esquerda

    }
}