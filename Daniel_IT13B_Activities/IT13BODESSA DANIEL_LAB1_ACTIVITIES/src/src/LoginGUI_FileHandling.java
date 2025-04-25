
package javaapplication52;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

 public class LoginGUI_FileHandling extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI_FileHandling() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(120, 30, 130, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 70, 130, 25);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 110, 80, 30);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginCheck();
            }
        });
    }

    private void loginCheck() {
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        boolean success = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String fileUser = parts[0].trim();
                    String filePass = parts[1].trim();

                    if (username.equals(fileUser) && password.equals(filePass)) {
                        success = true;
                        break;
                    }
                }
            }
            reader.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading file.");
            return;
        }

        if (success) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginGUI_FileHandling().setVisible(true);
        });
    }
}   

