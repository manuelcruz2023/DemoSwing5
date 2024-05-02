package co.edu.uptc.views.dialog.panelsDialogUserView;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import co.edu.uptc.views.dialog.configTextFieldView.ConfigTextFieldNumber;
import co.edu.uptc.views.dialog.configTextFieldView.LimitedTextField;

public class PanelBodyDialog extends javax.swing.JPanel {

    public PanelBodyDialog() {
        initPanel();
        createInputLabels();
        createTextFields();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.gray);
        this.setLayout(null);
    }

    private void createInputLabels() {
        createDocumentType();
        createDocumentNumber();
        createName();
        createLastName();
        createBirthdate();
        createGender();
        createTextFieldLastName();
        createTextFieldGender();
    }

    private void createTextFields() {
        createTextFieldDocumentType();
        createTextFieldDocumentNumber();
        createTextFieldName();
        createTextFieldLastName();
        createTextFieldBirthdate();
        createTextFieldGender();
    }

    private void createDocumentType() {
        JLabel documentType = new JLabel("Document Type");
        documentType.setBounds(20, 10, 100, 30);
        this.add(documentType);
    }

    private void createDocumentNumber() {
        JLabel documentNumber = new JLabel("Document Number");
        documentNumber.setBounds(20, 50, 200, 30);
        this.add(documentNumber);
    }

    private void createName() {
        JLabel name = new JLabel("Name");
        name.setBounds(20, 90, 100, 30);
        this.add(name);
    }

    private void createLastName() {
        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(20, 130, 100, 30);
        this.add(lastName);
    }

    private void createBirthdate() {
        JLabel birthdate = new JLabel("Birthdate");
        birthdate.setBounds(20, 170, 100, 30);
        this.add(birthdate);
    }

    private void createGender() {
        JLabel gender = new JLabel("Gender");
        gender.setBounds(20, 210, 100, 30);
        this.add(gender);
    }

    private void createTextFieldDocumentType() {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(220, 10, 200, 30);
        comboBox.addItem("T.I");
        comboBox.addItem("C.C");
        comboBox.addItem("C.E");
        comboBox.setSelectedIndex(-1);
        this.add(comboBox);
    }

    private void createTextFieldDocumentNumber() {
        ConfigTextFieldNumber textField = new ConfigTextFieldNumber();
        textField.setBounds(220, 50, 200, 30);
        this.add(textField);
    }

    private void createTextFieldName() {
        LimitedTextField textField = new LimitedTextField(40);
        textField.setBounds(220, 90, 200, 30);
        textField.setToolTipText("Max 40 characters");
        this.add(textField);
    }

    private void createTextFieldLastName() {
        LimitedTextField textField = new LimitedTextField(40);
        textField.setBounds(220, 130, 200, 30);
        textField.setToolTipText("Max 40 characters");
        this.add(textField);
    }

    private void createTextFieldBirthdate() {
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(220, 170, 200, 30);
        this.add(dateChooser);
    }

    private void createTextFieldGender() {
        JRadioButton radioButton1 = new JRadioButton("Mujer");
        JRadioButton radioButton2 = new JRadioButton("Hombre");
        radioButton1.setBounds(220, 210, 100, 40);
        radioButton2.setBounds(320, 210, 100, 40);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        this.add(radioButton1);
        this.add(radioButton2);
    }
}
