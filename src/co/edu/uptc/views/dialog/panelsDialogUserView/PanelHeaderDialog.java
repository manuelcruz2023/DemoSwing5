package co.edu.uptc.views.dialog.panelsDialogUserView;

import javax.swing.JLabel;

public class PanelHeaderDialog extends javax.swing.JPanel{
    public PanelHeaderDialog() {
        initPanel();
        createTittle();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.ORANGE);
    }

    private void createTittle() {
        JLabel tittle = new JLabel("Person Manager");
        tittle.setBounds(20,10,400,30);
        this.add(tittle);
    }
}
