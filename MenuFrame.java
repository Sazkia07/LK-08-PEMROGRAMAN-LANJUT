import javax.swing.*;

public class MenuFrame extends JFrame {
    public MenuFrame() {
        setTitle("Menu");
        setSize(400,300);
        setLayout(null);

        JButton s = new JButton("Siswa");
        JButton b = new JButton("Buku");
        JButton p = new JButton("Pegawai");
        JButton t = new JButton("Transaksi");
        JButton l = new JButton("Laporan");

        s.setBounds(100,20,200,30);
        b.setBounds(100,60,200,30);
        p.setBounds(100,100,200,30);
        t.setBounds(100,140,200,30);
        l.setBounds(100,180,200,30);

        add(s); add(b); add(p); add(t); add(l);

        s.addActionListener(e -> new SiswaForm());
        b.addActionListener(e -> new BukuForm());
        p.addActionListener(e -> new PegawaiForm());
        t.addActionListener(e -> new TransaksiForm());
        l.addActionListener(e -> new LaporanForm());

        setVisible(true);
    }
}