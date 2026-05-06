import javax.swing.*;

public class PegawaiForm extends JFrame {
    JTextField nip, nama, tgl;

    public PegawaiForm(){
        setTitle("Data Pegawai");
        setSize(320,260);
        setLayout(null);

        // Label
        add(new JLabel("NIP")).setBounds(20,20,80,25);
        add(new JLabel("Nama")).setBounds(20,60,80,25);
        add(new JLabel("Tgl Lahir")).setBounds(20,100,80,25);

        // Input
        nip = new JTextField();
        nama = new JTextField();
        tgl = new JTextField();

        nip.setBounds(100,20,180,25);
        nama.setBounds(100,60,180,25);
        tgl.setBounds(100,100,180,25);

        add(nip); add(nama); add(tgl);

        // Button
        JButton simpan = new JButton("Simpan");
        simpan.setBounds(100,150,100,30);

        add(simpan);

        simpan.addActionListener(e -> simpan());

        setVisible(true);
    }

    void simpan(){
        if(nip.getText().isEmpty() || nama.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Data belum lengkap!");
            return;
        }

        Pegawai p = new Pegawai(
            nip.getText(),
            nama.getText(),
            tgl.getText()
        );

        FileUtil.write("pegawai.txt", p.toString());
        JOptionPane.showMessageDialog(this,"Data pegawai tersimpan!");
    }
}