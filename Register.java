package projectD;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class Register {
    public static void main(String[] args) {
        // สร้าง JFrame ซึ่งเป็นหน้าต่างหลัก
        JFrame frame = new JFrame("Personal History");
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10)); // เพิ่มช่องว่างระหว่างองค์ประกอบ 10px

        // สร้าง JLabel สำหรับชื่อ นามสกุล และอายุ
        JLabel nameLabel = new JLabel("FirstName "+"Lastname:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel idcardLabel = new JLabel("ID Card:");
        JLabel AllergicLabel = new JLabel("Allergic:");

        // สร้าง JTextField สำหรับกรอกชื่อ นามสกุล และอายุ
        JTextField nameText = new JTextField();
        JTextField ageText = new JTextField();
        JTextField idcardText = new JTextField();
        JTextField AllergicText = new JTextField();

        // สร้างปุ่ม Save
        JButton saveButton = new JButton("Save");

        // การทำงานเมื่อคลิกปุ่ม Save
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String age = ageText.getText();
                String idcard = idcardText.getText();
                String Allergic = AllergicText.getText();

                // ตรวจสอบข้อมูล (ตัวอย่างง่าย)
                if(name.length() > 0 && age.length() > 0 && idcard.length() > 0 && Allergic.length() > 0) {
                    JOptionPane.showMessageDialog(frame, "Save Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields");
                }
            }
        });

        // เพิ่มองค์ประกอบเข้าไปใน frame
        frame.add(nameLabel);
        frame.add(nameText);
        frame.add(ageLabel);
        frame.add(ageText);
        frame.add(idcardLabel);
        frame.add(idcardText);
        frame.add(AllergicLabel);
        frame.add(AllergicText);
        
        frame.add(new JLabel()); // ช่องว่างเพื่อจัดตำแหน่งปุ่ม
        frame.add(saveButton);

        // ทำให้ UI ปรากฏ
        frame.setVisible(true);
    }
}
