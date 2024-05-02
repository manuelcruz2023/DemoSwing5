package co.edu.uptc.views.dialog.panelsDialogUserView;

import javax.swing.JButton;
import java.awt.*;

public class PanelFooterDialog extends javax.swing.JPanel{
    public PanelFooterDialog() {
        initPanel();
        createButtons();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.BLUE);
        this.setBounds(0, 0, 400, 200);
    }

    private void createButtons() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton buttonAdd = new JButton("Add");
        JButton buttonCancel = new JButton("Cancel");
        buttonAdd.setBounds(100, 260, 100, 30);
        buttonCancel.setBounds(200, 260, 100, 30);
        this.add(buttonAdd, gbc);
        this.add(buttonCancel, gbc);
    }
}
