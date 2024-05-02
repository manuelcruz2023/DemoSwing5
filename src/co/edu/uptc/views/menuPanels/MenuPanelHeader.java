package co.edu.uptc.views.menuPanels;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import co.edu.uptc.views.dialog.ManagerDialogAddView;

public class MenuPanelHeader extends JMenuBar{
    private JMenu menuFile;

    public MenuPanelHeader() {
        initMenu();
        createMenuFile();
        createButtonExit();
        createButtonDialog();
    }

    private void initMenu() {
    }

    private void createMenuFile() {
        menuFile = new JMenu("File");
        this.add(menuFile);
    }

    private void createButtonDialog() {
        JMenuItem button = new JMenuItem("Menu Item");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createManagerDialogAdd();
            }
        });
        menuFile.add(button);
    }

    private void createButtonExit() {
        JMenuItem buttonExit = new JMenuItem("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        menuFile.add(buttonExit);
    }

    private void createManagerDialogAdd() {
        ManagerDialogAddView ManagerDialogAdd = new ManagerDialogAddView();
        ManagerDialogAdd.begin();
    }
}
