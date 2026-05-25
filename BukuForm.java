import javax.swing.*;

public class BukuForm extends JFrame {
    JTextField kode, judul, jenis;

    public BukuForm(){
        setTitle("Data Buku");
        setSize(320,260);
        setLayout(null);

        // Label
        add(new JLabel("Kode")).setBounds(20,20,80,25);
        add(new JLabel("Judul")).setBounds(20,60,80,25);
        add(new JLabel("Jenis")).setBounds(20,100,80,25);

        // Input
        kode = new JTextField();
        judul = new JTextField();
        jenis = new JTextField();

        kode.setBounds(100,20,180,25);
        judul.setBounds(100,60,180,25);
        jenis.setBounds(100,100,180,25);

        add(kode); add(judul); add(jenis);

        // Button
        JButton simpan = new JButton("Simpan");
        simpan.setBounds(100,150,100,30);

        add(simpan);

        // Action
        simpan.addActionListener(e -> simpan());

        setVisible(true);
    }

    void simpan(){
        if(kode.getText().isEmpty() || judul.getText().isEmpty() || jenis.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Data belum lengkap!");
            return;
        }

        Buku b = new Buku(
            kode.getText(),
            judul.getText(),
            jenis.getText()
        );

        FileUtil.write("buku.txt", b.toString());
        JOptionPane.showMessageDialog(this,"Data buku tersimpan!");
    }
}
