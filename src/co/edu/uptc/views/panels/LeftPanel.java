package co.edu.uptc.views.panels;

import javax.swing.JPanel;

import co.edu.uptc.views.ConfigGlobalView;

public class LeftPanel extends JPanel{
    
    public LeftPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(ConfigGlobalView.LEFT_BACKGROUND_COLOR);
        this.setPreferredSize(new java.awt.Dimension(150, 0));
    }
}
