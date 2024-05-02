package co.edu.uptc.views.dialog.panelsDialogAddView;

import javax.swing.JLabel;

public class PanelHeaderDialogAdd extends javax.swing.JPanel{
    
    public PanelHeaderDialogAdd() {
        initPanel();
        createTittle();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.BLUE);
    }

    private void createTittle() {
        JLabel tittle = new JLabel("Add Person");
        tittle.setBounds(20,10,400,30);
        this.add(tittle);
    }
}
