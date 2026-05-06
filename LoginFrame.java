import javax.swing.*;

public class LoginFrame extends JFrame {
    JTextField user;
    JPasswordField pass;

    public LoginFrame() {
        setTitle("Login");
        setSize(300,200);
        setLayout(null);

        user = new JTextField();
        pass = new JPasswordField();

        add(new JLabel("NIP")).setBounds(20,20,80,25);
        add(new JLabel("Password")).setBounds(20,60,80,25);

        user.setBounds(100,20,150,25);
        pass.setBounds(100,60,150,25);

        JButton btn = new JButton("Login");
        btn.setBounds(100,100,100,30);

        add(user); add(pass); add(btn);

        btn.addActionListener(e -> {
            if(user.getText().equals("admin") && new String(pass.getPassword()).equals("123")){
                new MenuFrame();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this,"Login gagal");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}