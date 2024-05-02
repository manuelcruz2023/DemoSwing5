package co.edu.uptc.views.panels;

import javax.swing.JPanel;

public class LeftPanel extends JPanel{
    
    public LeftPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.cyan);
        this.setPreferredSize(new java.awt.Dimension(200, 0));
    }
}
