package projectD;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;

public class Login {
    public static void main(String[] args) {
        
        // สร้าง JFrame ซึ่งเป็นหน้าต่างหลัก
        JFrame frame = new JFrame("Login Form");
        frame.setSize(500, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // สร้าง JPanel สำหรับจัดองค์ประกอบภายใน
        JPanel mainPanel = new JPanel(new GridLayout(3, 2, 10, 10)); // 10px padding between rows and columns
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Padding around the main panel

        // สร้าง JLabel สำหรับชื่อผู้ใช้และรหัสผ่าน
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        // สร้าง JTextField สำหรับกรอกชื่อผู้ใช้ และ JPasswordField สำหรับกรอกรหัสผ่าน
        JTextField userText = new JTextField();
        JPasswordField passText = new JPasswordField();

        // สร้างปุ่ม Login และ Register
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        // การทำงานเมื่อคลิกปุ่ม Login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                // ตรวจสอบข้อมูล (ตัวอย่างง่าย)
                if(username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                }
            }
        });

        // เพิ่มองค์ประกอบเข้าไปใน mainPanel
        mainPanel.add(userLabel);
        mainPanel.add(userText);
        mainPanel.add(passLabel);
        mainPanel.add(passText);
        mainPanel.add(loginButton);
        mainPanel.add(registerButton);

        // เพิ่ม mainPanel ลงใน frame
        frame.add(mainPanel);

        // ทำให้ UI ปรากฏ
        frame.setVisible(true);
    }
}
