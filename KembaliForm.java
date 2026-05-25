import java.util.*;
import javax.swing.*;

public class KembaliForm extends JFrame {

    JTextField kode;

    public KembaliForm() {

        setTitle("Pengembalian Buku");
        setSize(300,200);
        setLayout(null);

        add(new JLabel("Kode Transaksi"))
                .setBounds(20,20,100,25);

        kode = new JTextField();
        kode.setBounds(130,20,120,25);

        JButton kembali = new JButton("Kembalikan");
        kembali.setBounds(80,80,120,30);

        add(kode);
        add(kembali);

        kembali.addActionListener(e -> proses());

        setVisible(true);
    }

    void proses() {

        List<String> data =
                FileUtil.read("transaksi.txt");

        List<String> baru =
                new ArrayList<>();

        for(String s : data){

            String[] d = s.split(";");

            if(d[0].equals(kode.getText())
                    && d[5].equals("0")){

                d[4] = "2026-06-01";
                d[5] = "1";
            }

            baru.add(
                    d[0] + ";" +
                    d[1] + ";" +
                    d[2] + ";" +
                    d[3] + ";" +
                    d[4] + ";" +
                    d[5]
            );
        }

        FileUtil.overwrite("transaksi.txt", baru);

        JOptionPane.showMessageDialog(
                this,
                "Buku berhasil dikembalikan"
        );
    }
}
