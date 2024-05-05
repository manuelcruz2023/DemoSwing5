package co.edu.uptc.views.dialog.panelsDialogUserView;

import javax.swing.JLabel;

import co.edu.uptc.views.ConfigGlobalView;

public class PanelHeaderDialog extends javax.swing.JPanel{
    public PanelHeaderDialog() {
        initPanel();
        createTittle();
    }

    private void initPanel() {
        this.setBackground(ConfigGlobalView.HEADER_BACKGROUND_COLOR);
        this.setForeground(ConfigGlobalView.HEADER_FOREGROUND_COLOR);
    }

    private void createTittle() {
        JLabel tittle = new JLabel("Person Manager");
        tittle.setForeground(getForeground());
        tittle.setBounds(20,10,400,30);
        this.add(tittle);
    }
}
