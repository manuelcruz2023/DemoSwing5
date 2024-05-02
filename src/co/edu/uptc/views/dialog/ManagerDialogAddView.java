package co.edu.uptc.views.dialog;

import co.edu.uptc.views.dialog.panelsDialogAddView.PanelBodyDialogAdd;
import co.edu.uptc.views.dialog.panelsDialogAddView.PanelFooterDialogAdd;
import co.edu.uptc.views.dialog.panelsDialogAddView.PanelHeaderDialogAdd;

public class ManagerDialogAddView extends javax.swing.JDialog{
 
    public ManagerDialogAddView() {
        initComponents();
        createPanelHeader();
        createPanelBody();
        createPanelFooter();
    }

    private void initComponents() {
        this.setSize(500,500);
        this.setLocationRelativeTo(co.edu.uptc.views.MainView.getInstance());
        this.setLayout(new java.awt.BorderLayout());
    }

    public void begin() {
        this.setVisible(true);
    }

    private void createPanelHeader() {
        PanelHeaderDialogAdd panelHeaderPerson = new PanelHeaderDialogAdd();
        this.add(panelHeaderPerson, java.awt.BorderLayout.NORTH);
    }

    private void createPanelBody() {
        PanelBodyDialogAdd panelWorkPerson = new PanelBodyDialogAdd();
        this.add(panelWorkPerson, java.awt.BorderLayout.CENTER);
    }

    private void createPanelFooter() {
        PanelFooterDialogAdd panelMenuPerson = new PanelFooterDialogAdd();
        this.add(panelMenuPerson, java.awt.BorderLayout.SOUTH);
    }
}
