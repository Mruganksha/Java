//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* 2.implement gui container */
public class Main{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().createGUI());
    }

    public void createGUI() {
        // Create the main JFrame or window
        JFrame frame = new JFrame("GUI Container");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        //  Create a JTabbedPane (Tabbed Interface)
        JTabbedPane tabbedPane = new JTabbedPane();

        //  Create Panels
        JPanel panel1 = createPanel1();
        JPanel panel2 = createPanel2();

        //  Add Panels to Tabs
        tabbedPane.addTab("Tab 1 - Input", panel1);
        tabbedPane.addTab("Tab 2 - Output", panel2);

        //  Add TabbedPane to JFrame
        frame.add(tabbedPane, BorderLayout.CENTER);

        //  Make the Frame Visible
        frame.setVisible(true);
    }

    // Panel 1: Contains a Label, TextField, and Button
    private JPanel createPanel1() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        // Button Action:
        button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Hello, " + textField.getText()));

        // Add Components to Panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        return panel;
    }

    // Panel 2: Contains a TextArea with ScrollBar
    private JPanel createPanel2() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea("This is a Gui container example");
        JScrollPane scrollPane = new JScrollPane(textArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        return panel;
    }
}
