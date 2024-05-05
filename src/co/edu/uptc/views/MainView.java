package co.edu.uptc.views;

import javax.swing.JFrame;
import co.edu.uptc.views.menuPanels.MenuPanelHeader;
import co.edu.uptc.views.panels.*; // Import all panels
public class MainView extends JFrame{

    private static MainView instance = null;

    //TODO quitar el singleton
    //creo que quite el bin 
    private MainView() {
        initFrame();
        headerPanel();
        leftPanel();
        panelCenter();
        rightPanel();
        footerPanel();
        createMenuHeader();
    }

    public static MainView getInstance() {
        if (instance == null) {
            instance = new MainView();
        }
        return instance;
    }

    private void initFrame() {
        this.setTitle("Taller de programacion!");
        this.setSize(800, 600);
        this.setLayout(new java.awt.BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void begin () {
        this.setVisible(true);
    }

    private void createMenuHeader() {
        MenuPanelHeader menuHeader = new MenuPanelHeader();
        this.setJMenuBar(menuHeader);
    }

    private void rightPanel () {
        RightPanel rightPanel = new RightPanel();
        this.add(rightPanel, java.awt.BorderLayout.EAST);
    }

    private void panelCenter () {
        PanelCenter panelCenter = new PanelCenter();
        this.add(panelCenter, java.awt.BorderLayout.CENTER);
    }

    private void leftPanel () {
        LeftPanel leftPanel = new LeftPanel();
        this.add(leftPanel, java.awt.BorderLayout.WEST);
    }

    private void headerPanel () {
        HeaderPanel headerPanel = new HeaderPanel();
        this.add(headerPanel, java.awt.BorderLayout.NORTH);
    }

    private void footerPanel () {
        FooterPanel footerPanel = new FooterPanel();
        this.add(footerPanel, java.awt.BorderLayout.SOUTH);
    }

}