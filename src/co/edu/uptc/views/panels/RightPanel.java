package co.edu.uptc.views.panels;

import javax.swing.JPanel;

public class RightPanel extends JPanel{
    
    public RightPanel() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.RED);
        this.setPreferredSize(new java.awt.Dimension(200, 0));
    }
}
