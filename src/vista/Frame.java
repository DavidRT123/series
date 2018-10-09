/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Show;

/**
 *
 * @author mdfda
 */
public class Frame extends JFrame {

    private JPanel panel1 = new JPanel(), panel2 = new JPanel(), panel3 = new JPanel();
    private JButton b1, b2, b3, b4, b5, b6, b7;
    private JLabel e1, e2, e3, e4, e5;
    private JTextField t1, t2, t3, t4, t5;
    private Controlador c = null;

    public Frame(Controlador control) {
        c = control;
        setSize(500, 300);
        setTitle("Mis series");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(5, 2, 10, 10));
        panel3.setLayout(new FlowLayout());

        add(panel1);
        panel1.add(panel3, BorderLayout.NORTH);
        panel1.add(panel2, BorderLayout.CENTER);

        b1 = new JButton("¡<");
        b2 = new JButton("<");
        b3 = new JButton(">");
        b4 = new JButton(">¡");
        b5 = new JButton("+");
        b6 = new JButton("-");
        b7 = new JButton("*");

        panel3.add(b1);
        panel3.add(b2);
        panel3.add(b3);
        panel3.add(b4);
        panel3.add(b5);
        panel3.add(b6);
        panel3.add(b7);

        e1 = new JLabel("Título");
        t1 = new JTextField(50);
        panel2.add(e1);
        panel2.add(t1);

        e2 = new JLabel("Guionista");
        t2 = new JTextField(50);
        panel2.add(e2);
        panel2.add(t2);

        e3 = new JLabel("Temporada");
        t3 = new JTextField(5);
        panel2.add(e3);
        panel2.add(t3);

        e4 = new JLabel("Género");
        t4 = new JTextField(50);
        panel2.add(e4);
        panel2.add(t4);

        e5 = new JLabel("Temp. Vistas");
        t5 = new JTextField(5);
        panel2.add(e5);
        panel2.add(t5);
        
        //Cargar el primer registro nada más abrir la aplicación
        actualiza(c.primero());

        ButtonListener bl = new ButtonListener();

        b1.addActionListener(bl);
        b2.addActionListener(bl);
        b3.addActionListener(bl);
        b4.addActionListener(bl);
        b5.addActionListener(bl);
        b6.addActionListener(bl);
        b7.addActionListener(bl);
    }

    private void actualiza(Show s) {
        t1.setText(s.getTitle());
        t2.setText(s.getScripWriter());
        t3.setText(String.valueOf(s.getSeasons()));
        t4.setText(s.getGenre());
        t5.setText(String.valueOf(s.getViews()));
    }

    private Show llenaShow() {
        Show s = new Show(t1.getText(), t2.getText(), t4.getText(), Integer.parseInt(t3.getText()), Integer.parseInt(t5.getText()));
        return s;
    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Show s = new Show();
            if (e.getSource() == b1) {
                s = c.primero();
            }
            if (e.getSource() == b2) {
                s = c.anterior();
            }
            if (e.getSource() == b3) {
                s = c.siguiente();
            }
            if (e.getSource() == b4) {
                s = c.ultimo();
            }
            if (e.getSource() == b5) {
                if (b5.getText().equals("+")) {
                    //Limpiar campos y cambiar fondo
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    colorear(Color.yellow);
                    //Inhabilitar resto de botones
                    inhabilitarBotones(5);
                    //Cambiar texto del botón
                    b5.setText("+++");
                } else {
                    //Recoger valores de los registros
                    s = llenaShow();
                    //Llamar al metodo para crear nuevo registro
                    c.nuevo(s);
                    //Quitar color campos
                    colorear(Color.white);
                    //Habilitar resto de botones
                    habilitarBotones();
                    //Cambiar texto del botón
                    b5.setText("+");
                }
            }
            if (e.getSource() == b6) {
                s = c.borrar();
            }
            if (e.getSource() == b7) {
                if (b7.getText().equals("*")) {
                    //Inhabilitar botones
                    inhabilitarBotones(7);
                    //Cambiar texto botón
                    b7.setText("***");
                    //Añadir color
                    colorear(Color.yellow);
                    s = llenaShow();
                } else {
                    s = llenaShow();
                    c.actualizar(s);
                    //Quitar color
                    colorear(Color.white);
                    //Habilitar botones
                    habilitarBotones();
                    
                }
            }
            actualiza(s);
        }

        public void colorear(Color color) {
            t1.setBackground(color);
            t2.setBackground(color);
            t3.setBackground(color);
            t4.setBackground(color);
            t5.setBackground(color);
        }

        public void inhabilitarBotones(int noInhabilitar) {
            if (noInhabilitar != 1) {
                b1.setEnabled(false);
            }
            if (noInhabilitar != 2) {
                b2.setEnabled(false);
            }
            if (noInhabilitar != 3) {
                b3.setEnabled(false);
            }
            if (noInhabilitar != 4) {
                b4.setEnabled(false);
            }
            if (noInhabilitar != 5) {
                b5.setEnabled(false);
            }
            if (noInhabilitar != 6) {
                b6.setEnabled(false);
            }
            if (noInhabilitar != 7) {
                b7.setEnabled(false);
            }
        }

        public void habilitarBotones() {
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
        }
    }
}
