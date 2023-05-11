import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Registration extends JFrame{
    private JPanel panel, genderPanel;
    private JLabel nameL, emailL, genderL, fieldL, languagesL;
    private JButton submit;
    private JTextField name, email;
    private JRadioButton male, female;
    private JList<String> field;
    private JCheckBox cpp, java, python, js, ruby, pearl;

    Registration(){
        // Panel Configuration
        panel = new JPanel(new GridLayout(15,10));
        genderPanel = new JPanel(new FlowLayout());

        // Name
        nameL = new JLabel("Name:");
        name = new JTextField(20);

        // Email
        emailL = new JLabel("Email:");
        email = new JTextField(20);

        // Gender
        genderL = new JLabel("Gender:");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        genderPanel.add(male);
        genderPanel.add(female);

        // Fields of Development
        fieldL = new JLabel("Field:");
        DefaultListModel <String> list = new DefaultListModel<>();
        list.addElement("Web Development");
        list.addElement("Machine Learning");
        list.addElement("Android Development");
        list.addElement("DevOps");
        list.addElement("Cloud Computing");
        field = new JList<>(list);

        // Programming Languages
        languagesL = new JLabel("Programming Languages:");
        cpp = new JCheckBox("C++");
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        js = new JCheckBox("JavaScript");
        ruby = new JCheckBox("Ruby");
        pearl = new JCheckBox("Pearl");

        // Submit Button
        submit = new JButton("Submit");

        // Add all components to Panel
        panel.add(nameL);
        panel.add(name);
        panel.add(emailL);
        panel.add(email);
        panel.add(genderL);
        panel.add(genderPanel);
        panel.add(fieldL);
        panel.add(field);
        panel.add(languagesL);
        panel.add(cpp);
        panel.add(java);
        panel.add(python);
        panel.add(js);
        panel.add(ruby);
        panel.add(pearl);

        // Frame Configuration
        add(panel);
        add(submit);
        setLayout(new GridLayout(2,1));
        setSize(350,500);
        setVisible(true);
    }
}

class Main{
    public static void main(String[] args) {
        new Registration();
    }
}