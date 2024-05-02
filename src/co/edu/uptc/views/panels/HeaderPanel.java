package co.edu.uptc.views.panels;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.JButton;
import javax.swing.JLabel;

public class HeaderPanel extends javax.swing.JPanel{
    private JLabel tittle;
    private JLabel tittle2;
    private JLabel tittle3;

    public HeaderPanel() {
        initPanel();
        createTittle();
        createButton();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.YELLOW);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 200)); 
    }

    private void createTittle() {
        tittle = new JLabel("Universidad Pedagogica y Tecnologica de Colombia");
        tittle.setBounds(10,10,400,30);
        this.add(tittle);

        tittle2  = new JLabel("Ingenieria de Sistemas");
        tittle2.setBounds(20,30,300,30);
        this.add(tittle2);

        tittle3 = new JLabel("Demo Swing");
        tittle3.setBounds(20,50,300,30);
        this.add(tittle3);
    }

    private void centerElements() {
        centerElement(tittle);
        centerElement(tittle2);
        centerElement(tittle3);
    }

    private void centerElement (JLabel text) {
        Font font = text.getFont();
        FontMetrics metrics = text.getGraphics().getFontMetrics(font);
        int width = metrics.stringWidth(text.getText());
        int x = (this.getSize().width/2) - (width/2);
        text.setLocation(x, text.getY());
    }

    private void createButton() {
        JButton button = new JButton("center");
        button.setBounds(10,100,100,30);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerElements();
            }
        });
        this.add(button);
    }
}
