package co.edu.uptc.views.panels;

import javax.swing.JPanel;

import co.edu.uptc.views.ConfigGlobalView;

public class PanelCenter extends JPanel{
    
    public PanelCenter () {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(ConfigGlobalView.CENTER_BACKGROUND_COLOR);
    }
}
