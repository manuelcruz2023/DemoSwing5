package co.edu.uptc.views.panels;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JButton;
import javax.swing.JLabel;

import co.edu.uptc.views.ConfigGlobalView;

public class HeaderPanel extends javax.swing.JPanel {
    private JLabel tittle;
    private JLabel tittle2;
    private JLabel tittle3;

    public HeaderPanel() {
        initPanel();
        createTittle();
        clickToCenter();
    }

    private void initPanel() {
        this.setBackground(ConfigGlobalView.HEADER_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.HEADER_FOREGROUND_COLOR);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 100));
    }

    private void createTittle() {
        tittle = new JLabel("Universidad Pedagogica y Tecnologica de Colombia");
        tittle.setForeground(getForeground());
        tittle.setBounds(10, 10, 400, 30);
        this.add(tittle);

        tittle2 = new JLabel("Ingenieria de Sistemas");
        tittle2.setForeground(getForeground());
        tittle2.setBounds(20, 30, 300, 30);
        this.add(tittle2);

        tittle3 = new JLabel("Demo Swing");
        tittle3.setForeground(getForeground());
        tittle3.setBounds(20, 50, 300, 30);
        this.add(tittle3);
    }

    private void centerElements() {
        centerElement(tittle);
        centerElement(tittle2);
        centerElement(tittle3);
    }

    private void centerElement(JLabel text) {
        Font font = text.getFont();
        FontMetrics metrics = text.getGraphics().getFontMetrics(font);
        int width = metrics.stringWidth(text.getText());
        int x = (this.getSize().width / 2) - (width / 2);
        text.setLocation(x, text.getY());
    }

    private void clickToCenter() {
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                centerElements();
            }
        });
    }
}
