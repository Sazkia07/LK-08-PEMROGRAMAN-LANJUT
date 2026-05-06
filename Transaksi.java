public class Transaksi {
    String kode, nis, buku, tglPinjam, tglKembali;
    int status;

    public Transaksi(String kode, String nis, String buku,
                     String tglPinjam, String tglKembali, int status) {
        this.kode = kode;
        this.nis = nis;
        this.buku = buku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.status = status;
    }

    public String toString() {
        return kode + ";" + nis + ";" + buku + ";" +
               tglPinjam + ";" + tglKembali + ";" + status;
    }
}