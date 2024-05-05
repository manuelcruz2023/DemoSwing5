package co.edu.uptc.views.dialog.panelsDialogAddView;

import javax.swing.JButton;

import co.edu.uptc.views.ConfigGlobalView;
import co.edu.uptc.views.dialog.ManagerDialogUserView;

public class PanelBodyDialogAdd extends javax.swing.JPanel{
    
    public PanelBodyDialogAdd() {
        initPanel();
        createButtonAdd();
    }

    private void initPanel() {
        this.setBackground(ConfigGlobalView.BODY_BACKGROUND_COLOR);
    }

    private void createButtonAdd() {
        JButton buttonAdd = new JButton("Add");
        buttonAdd.setBounds(20,10,400,30);
        this.add(buttonAdd);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDialogUser();
            }
        });
    }

    private void createDialogUser() {
        ManagerDialogUserView managerDialogUser = new ManagerDialogUserView();
        managerDialogUser.begin();
    }
}
