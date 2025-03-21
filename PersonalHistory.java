package projectD;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.border.EmptyBorder;

public class PersonalHistory {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Personal History");
        frame.setSize(500, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set layout for the main frame
        JPanel mainPanel = new JPanel(new GridLayout(7, 2, 10, 10)); // 10px padding between rows and columns
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Padding around the main panel
        
        JLabel FirstLabel = new JLabel("Firstname:");
        JLabel LastLabel = new JLabel("Lastname:");
        JLabel DateLabel = new JLabel("Date of Birth (DD/MM/YYYY):");
        JLabel idcardLabel = new JLabel("ID Card:");
        JLabel PhoneLabel = new JLabel("Phone Number:");
        JLabel EmailLabel = new JLabel("Email:");
        
        JTextField FirstText = new JTextField();
        JTextField LastText = new JTextField();
        JTextField DateText = new JTextField();
        JTextField idcardText = new JTextField();
        JTextField PhoneText = new JTextField();
        JTextField EmailText = new JTextField();

        JButton RegisterButton = new JButton("Register");
        RegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Firstname = FirstText.getText();
                String Lastword = LastText.getText();
                String Date = DateText.getText();
                String idcard = idcardText.getText();
                String Phone = PhoneText.getText();
                String Email = EmailText.getText();
                
                if(Firstname.equals("admin") && Lastword.equals("password") && Date.equals("password") && idcard.equals("password") && Phone.equals("password") && Email.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Register Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                }
            }
        });

        // Add components to the panel
        mainPanel.add(FirstLabel);
        mainPanel.add(FirstText);
        mainPanel.add(LastLabel);
        mainPanel.add(LastText);
        mainPanel.add(DateLabel);
        mainPanel.add(DateText);
        mainPanel.add(idcardLabel);
        mainPanel.add(idcardText);
        mainPanel.add(PhoneLabel);
        mainPanel.add(PhoneText);
        mainPanel.add(EmailLabel);
        mainPanel.add(EmailText);
        mainPanel.add(new JLabel()); // Placeholder to align the button to the right
        mainPanel.add(RegisterButton);

        // Add main panel to frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
