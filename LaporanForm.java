import javax.swing.*;

public class LaporanForm extends JFrame {

    JTextArea area;

    public LaporanForm(){
        setTitle("Laporan");
        setSize(400,300);

        area = new JTextArea();
        add(new JScrollPane(area));

        tampil();

        setVisible(true);
    }

    void tampil(){
        StringBuilder sb = new StringBuilder();

        for(String s: FileUtil.read("transaksi.txt")){
            String[] d = s.split(";");
            if(d[5].equals("0")){
                sb.append("Belum kembali: ").append(s).append("\n");
            }
        }

        area.setText(sb.toString());
    }
}