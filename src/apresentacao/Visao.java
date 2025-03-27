package apresentacao;

import javax.swing.*;
import java.io.Serial;

public class Visao extends JFrame {

    /**
     *
     */

    private static final long serialVersionUID = 1L;


    public static void main(String[] args) {
        new Visao().setVisible(true);
    }

    public Visao(){
        setTitle("Minha primeira janela java");
        setSize(1024, 724);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Painel painelDesenho = new Painel();

        setContentPane(painelDesenho);
    }

}