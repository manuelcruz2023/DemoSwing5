package co.edu.uptc.views.panels;

import javax.swing.JPanel;

import co.edu.uptc.views.ConfigGlobalView;

public class FooterPanel extends JPanel{
    
    public FooterPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(ConfigGlobalView.FOOTER_BACKGROUND_COLOR);
        this.setPreferredSize(new java.awt.Dimension(800, 100));
    }


}
