package br.com.salvadados;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Keylogger extends JFrame implements KeyListener {

    private JTextArea textArea;

    public Keylogger() {
        setTitle("Keylogger");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.addKeyListener(this);

        add(textArea);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Ação a ser executada quando uma tecla é pressionada
        textArea.append("Tecla Pressionada: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Ação a ser executada quando uma tecla é liberada
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Ação a ser executada quando uma tecla é digitada
    }

    public static void main(String[] args) {
        new Keylogger();
    }
}
