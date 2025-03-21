package projectD;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
public class Login {
    public static void main(String[] args) {
        // สร้าง JFrame ซึ่งเป็นหน้าต่างหลัก
        JFrame frame = new JFrame("Login Form");
        frame.setSize(600, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        // สร้าง JLabel สำหรับชื่อผู้ใช้และรหัสผ่าน
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        // สร้าง JTextField สำหรับกรอกชื่อผู้ใช้ และ JPasswordField สำหรับกรอกรหัสผ่าน
        JTextField userText = new JTextField();
        JPasswordField passText = new JPasswordField();

        // สร้างปุ่ม Login
        JButton loginButton = new JButton("Login");

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

        // เพิ่มองค์ประกอบเข้าไปใน frame
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);

        // ทำให้ UI ปรากฏ
        frame.setVisible(true);
    }
}