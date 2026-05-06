
# 📚 Sistem Perpustakaan SMP (Java GUI Swing)

## 📌 Deskripsi
Program ini merupakan sistem perpustakaan sederhana berbasis Java GUI (Swing) yang digunakan untuk mengelola data siswa, buku, pegawai, serta transaksi peminjaman dan pengembalian buku.

Data disimpan menggunakan file teks (.txt) sebagai pengganti database.

Program ini dibuat untuk memenuhi tugas LK06 dengan menerapkan:
- Object-Oriented Programming (OOP)
- Pengolahan String
- File I/O (Read, Write, Update)
- GUI menggunakan Swing

---

## ⚙️ Alur Program

Secara keseluruhan, program dimulai dari class Main, di mana sistem akan langsung menampilkan form login (LoginFrame). Pada tahap ini, pengguna (pegawai) diminta memasukkan NIP dan password.

Sistem kemudian melakukan validasi login. Jika menggunakan versi sederhana, login dicek menggunakan data statis (admin / 123). Jika menggunakan file, sistem akan membaca file pegawai.txt, kemudian setiap baris dipecah menggunakan method split() dan dicocokkan dengan input pengguna. Jika data cocok, maka login berhasil dan pengguna masuk ke menu utama. Jika tidak, maka akan muncul pesan gagal login.

Setelah login berhasil, program akan masuk ke MenuFrame yang berisi beberapa pilihan menu, yaitu:
- Data Siswa
- Data Buku
- Data Pegawai
- Transaksi
- Laporan

Setiap menu akan membuka form GUI masing-masing.

---

## 👨‍🎓 Data Siswa

Pada menu ini, pengguna dapat menambahkan data siswa berupa:
- NIS
- Nama
- Alamat

Data yang diinput akan dibuat menjadi objek Siswa, kemudian dikonversi menjadi string dengan format:
nis;nama;alamat

Selanjutnya data disimpan ke file siswa.txt menggunakan FileUtil.write().

---

## 📚 Data Buku

Pengguna dapat menambahkan data buku berupa:
- Kode Buku
- Judul Buku
- Jenis Buku

Data disimpan ke file buku.txt dengan format:
kode;judul;jenis

---

## 👨‍💼 Data Pegawai

Digunakan untuk menyimpan data pegawai:
- NIP
- Nama
- Tanggal Lahir

Data disimpan ke file pegawai.txt dengan format:
nip;nama;tanggal

Data ini juga dapat digunakan sebagai autentikasi login.

---

## 🔄 Transaksi Peminjaman

Pada saat melakukan peminjaman buku, sistem akan:
1. Membaca file transaksi.txt
2. Menghitung jumlah buku yang sedang dipinjam oleh siswa (status = 0)
3. Jika jumlah ≥ 2 → peminjaman ditolak
4. Jika jumlah < 2 → transaksi diproses

Data transaksi disimpan dengan format:
kode;nis;kodeBuku;tglPinjam;tglKembali;status

Keterangan:
- status = 0 → belum dikembalikan
- status = 1 → sudah dikembalikan

---

## 🔁 Proses Pengembalian

Pada proses pengembalian:
- Sistem membaca seluruh data dari transaksi.txt
- Mencari transaksi berdasarkan kode
- Mengubah status dari 0 menjadi 1
- Menyimpan ulang seluruh data menggunakan overwrite

Metode ini menunjukkan bahwa update data dilakukan dengan cara:
baca file → ubah di memori → tulis ulang file

---

## 📊 Laporan

Pada menu laporan, sistem akan:
- Membaca file transaksi.txt
- Menampilkan transaksi dengan status 0

Artinya, laporan menampilkan daftar buku yang belum dikembalikan.

---

## 🔁 Pola Pengolahan Data

Seluruh sistem menggunakan pola yang sama:
1. Membaca data dari file
2. Mengubah string menjadi objek (split)
3. Memproses data sesuai kebutuhan
4. Menyimpan kembali ke file

Dengan demikian:
- File .txt berfungsi sebagai database
- Class seperti Siswa, Buku, Pegawai, dan Transaksi sebagai representasi objek

---

## 🗂️ Struktur Project

Main.java  
LoginFrame.java  
MenuFrame.java  

Siswa.java  
Buku.java  
Pegawai.java  
Transaksi.java  

FileUtil.java  

SiswaForm.java  
BukuForm.java  
PegawaiForm.java  
TransaksiForm.java  
LaporanForm.java  

---

## 💾 Contoh Data

siswa.txt  
123;Budi;Malang  
124;Siti;Blitar  

buku.txt  
B001;Matematika;Pelajaran  
B002;IPA;Pelajaran  

transaksi.txt  
T001;123;B001;2026-05-06;-;0  

---

## ⚠️ Penanganan Error

Program menggunakan exception handling pada File I/O untuk menangani:
- File tidak ditemukan
- Kesalahan saat membaca file
- Kesalahan saat menulis file

---

## 🚀 Fitur Utama

- Login pegawai  
- CRUD data siswa, buku, pegawai  
- Transaksi peminjaman  
- Validasi maksimal 2 buku  
- Laporan buku belum kembali  
- GUI berbasis Swing  
- Penyimpanan berbasis file .txt  

---

## 🔥 Pengembangan Lanjutan (Opsional)

- Edit dan hapus data  
- Tampilan menggunakan JTable  
- Sistem denda keterlambatan  
- Login berbasis file (real authentication)  
- Penggunaan LocalDate untuk tanggal otomatis  

---

## 👨‍💻 Author

Tugas LK06 - Pemrograman Berbasis Objek  
Java GUI Swing - Sistem Perpustakaan
