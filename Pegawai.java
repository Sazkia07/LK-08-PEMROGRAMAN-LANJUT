public class Pegawai {
    String nip, nama, tgl;

    public Pegawai(String nip, String nama, String tgl) {
        this.nip = nip;
        this.nama = nama;
        this.tgl = tgl;
    }

    public String toString() {
        return nip + ";" + nama + ";" + tgl;
    }
}