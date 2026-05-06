import javax.swing.*;

public class SiswaForm extends JFrame {
    JTextField nis,nama,alamat;

    public SiswaForm(){
        setTitle("Siswa");
        setSize(300,250);
        setLayout(null);

        nis = new JTextField();
        nama = new JTextField();
        alamat = new JTextField();

        add(new JLabel("NIS")).setBounds(20,20,80,25);
        add(new JLabel("Nama")).setBounds(20,60,80,25);
        add(new JLabel("Alamat")).setBounds(20,100,80,25);

        nis.setBounds(100,20,150,25);
        nama.setBounds(100,60,150,25);
        alamat.setBounds(100,100,150,25);

        JButton simpan = new JButton("Simpan");
        simpan.setBounds(100,140,100,30);

        add(nis); add(nama); add(alamat); add(simpan);

        simpan.addActionListener(e -> {
            Siswa s = new Siswa(nis.getText(), nama.getText(), alamat.getText());
            FileUtil.write("siswa.txt", s.toString());
            JOptionPane.showMessageDialog(this,"Tersimpan");
        });

        setVisible(true);
    }
}