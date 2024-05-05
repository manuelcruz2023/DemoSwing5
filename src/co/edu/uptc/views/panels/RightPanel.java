package co.edu.uptc.views.panels;

import javax.swing.JPanel;

import co.edu.uptc.views.ConfigGlobalView;

public class RightPanel extends JPanel{
    
    public RightPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(ConfigGlobalView.RIGHT_BACKGROUND_COLOR);
        this.setPreferredSize(new java.awt.Dimension(150, 0));
    }
}
