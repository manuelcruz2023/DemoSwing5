package co.edu.uptc.views.dialog;

import co.edu.uptc.views.dialog.panelsDialogUserView.PanelBodyDialog;
import co.edu.uptc.views.dialog.panelsDialogUserView.PanelFooterDialog;
import co.edu.uptc.views.dialog.panelsDialogUserView.PanelHeaderDialog;

public class ManagerDialogUserView extends javax.swing.JDialog{

    public ManagerDialogUserView() {
        initDialog();
        createPanelHeader();
        createPanelBody();
        createPanelFooter();
    }

    private void initDialog() {
        this.setSize(500,500);
        this.setLocationRelativeTo(co.edu.uptc.views.MainView.getInstance());
        this.setLayout(new java.awt.BorderLayout());
    }

    public void begin() {
        this.setVisible(true);
    }

    private void createPanelHeader() {
        PanelHeaderDialog panelHeaderPerson = new PanelHeaderDialog();
        this.add(panelHeaderPerson, java.awt.BorderLayout.NORTH);
    }

    private void createPanelFooter() {
        PanelFooterDialog panelMenuPerson = new PanelFooterDialog();
        this.add(panelMenuPerson, java.awt.BorderLayout.SOUTH);
    }

    private void createPanelBody() {
        PanelBodyDialog panelWorkPerson = new PanelBodyDialog();
        this.add(panelWorkPerson, java.awt.BorderLayout.CENTER);
    }
}