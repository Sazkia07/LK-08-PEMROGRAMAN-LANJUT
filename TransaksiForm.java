import javax.swing.*;

public class TransaksiForm extends JFrame {
    JTextField kode, nis, buku;

    public TransaksiForm(){
        setTitle("Transaksi");
        setSize(300,250);
        setLayout(null);

        kode = new JTextField();
        nis = new JTextField();
        buku = new JTextField();

        add(new JLabel("Kode")).setBounds(20,20,80,25);
        add(new JLabel("NIS")).setBounds(20,60,80,25);
        add(new JLabel("Buku")).setBounds(20,100,80,25);

        kode.setBounds(100,20,150,25);
        nis.setBounds(100,60,150,25);
        buku.setBounds(100,100,150,25);

        JButton pinjam = new JButton("Pinjam");
        pinjam.setBounds(100,140,100,30);

        add(kode); add(nis); add(buku); add(pinjam);

        pinjam.addActionListener(e -> proses());

        setVisible(true);
    }

    int hitung(String nis){
        int c=0;
        for(String s: FileUtil.read("transaksi.txt")){
            String[] d = s.split(";");
            if(d[1].equals(nis) && d[5].equals("0")) c++;
        }
        return c;
    }
    boolean bukuDipinjam(String buku){

    for(String s : FileUtil.read("transaksi.txt")){

        String[] d = s.split(";");

        if(d[2].equalsIgnoreCase(buku)
                && d[5].equals("0")){

            return true;
        }
    }

    return false;
}
    boolean bukuAda(String buku){

    for(String s : FileUtil.read("buku.txt")){

        String[] d = s.split(";");

        if(d[1].equalsIgnoreCase(buku)){
            return true;
        }
    }

    return false;
}

    void proses(){
        if(!bukuAda(buku.getText())){

    JOptionPane.showMessageDialog(
        this,
        "Buku tidak tersedia!"
    );

    return;
}
        if(bukuDipinjam(buku.getText())){

    JOptionPane.showMessageDialog(
        this,
        "Buku sedang dipinjam!"
    );

    return;
}
        if(kode.getText().isEmpty() || nis.getText().isEmpty() || buku.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Data belum lengkap!");
            return;
        }
        if(hitung(nis.getText())>=2){
            JOptionPane.showMessageDialog(this,"Max 2 buku!");
            return;
        }

        Transaksi t = new Transaksi(
            kode.getText(),
            nis.getText(),
            buku.getText(),
            "2026-05-06",
            "-",
            0
        );

        FileUtil.write("transaksi.txt", t.toString());
        JOptionPane.showMessageDialog(this,"Berhasil pinjam");
    }
}
