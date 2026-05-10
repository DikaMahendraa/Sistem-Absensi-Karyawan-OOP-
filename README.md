Kelompok :

 I Gede Dika Mahendra Putra (42530027)
 I Gede Mahesa adinata (42530041)
 Abdullah Sami (42530018)
 I Gusti Agung Agatha Nanda Prayoga (42530044)

 PENJELASAN PROGRAM SISTEM MANAJEMEN KARYAWAN DAN ABSENSI (JAVA OOP)

1. GAMBARAN UMUM SISTEM
Program ini adalah sistem manajemen karyawan berbasis Java OOP yang digunakan untuk mengelola data karyawan, jabatan, shift kerja, dan absensi. Sistem ini juga memungkinkan admin untuk menambah, mengubah, menghapus karyawan serta melihat laporan absensi.

Konsep utama yang digunakan:
- Encapsulation (private atribut + getter/setter)
- Class dan Objectt  
- Relasi antar class (association)
- List (one-to-many relationship)
- Validasi data menggunakan if-else

------------------------------------------------------------

2. CLASS JABATAN
Class ini digunakan untuk menyimpan informasi jabatan karyawan.

Atribut:
- nama : nama jabatan (contoh: Programmer, HRD)
- deskripsi : penjelasan jabatan

Fungsi:
Menyimpan data posisi pekerjaan setiap karyawan.

Relasi:
Satu karyawan memiliki satu jabatan.

------------------------------------------------------------

3. CLASS SHIFT
Class ini digunakan untuk mengatur jam kerja karyawan.

Atribut:
- nama : nama shift (pagi/sore/malam)
- jamMulai : waktu mulai kerja
- jamSelesai : waktu selesai kerja
- toleransiTerlambat : batas keterlambatan

Fungsi:
Mengatur jadwal kerja karyawan.

------------------------------------------------------------

4. CLASS ABSENSI
Class ini digunakan untuk mencatat kehadiran karyawan setiap hari.

Atribut:
- tanggal : tanggal absensi
- jamMasuk : waktu check-in
- jamKeluar : waktu check-out
- status : status absensi (BELUM_ABSEN, MASUK, SELESAI)
- keterangan : informasi tambahan

Method penting:
- checkIn() : mencatat jam masuk
- checkOut() : mencatat jam keluar
- hitungDurasi() : menghitung lama kerja dalam jam

Fungsi:
Menyimpan dan mengelola data kehadiran karyawan.

Relasi:
Satu karyawan memiliki banyak data absensi (one-to-many).

------------------------------------------------------------

5. CLASS KARYAWAN
Class ini adalah representasi data karyawan dalam sistem.

Atribut:
- nama : nama karyawan
- alamat : alamat karyawan
- email : email karyawan
- tanggalMasuk : tanggal mulai kerja
- jabatan : objek dari class Jabatan
- absensiList : daftar absensi karyawan

Method:
- setAlamat() : validasi alamat tidak boleh kosong
- tambahAbsensi() : menambahkan data absensi
- tampilkanInfo() : menampilkan data karyawan

Fungsi:
Menyimpan data utama karyawan dan menghubungkan dengan jabatan serta absensi.

------------------------------------------------------------

6. CLASS ADMIN
Class ini digunakan untuk mengelola seluruh data karyawan.

Atribut:
- username : username admin
- password : password admin
- dataKaryawan : list semua karyawan

Method:
- login() : validasi username dan password
- tambahKaryawan() : menambahkan karyawan
- updateKaryawan() : mengubah data karyawan
- hapusKaryawan() : menghapus karyawan berdasarkan nama
- lihatLaporanAbsensi() : menampilkan semua data absensi

Fungsi:
Sebagai pengelola utama sistem (CRUD data karyawan).

------------------------------------------------------------

7. CLASS MAIN
Class ini adalah program utama untuk menjalankan sistem.

Proses yang dilakukan:
1. Membuat data jabatan
2. Membuat data karyawan
3. Melakukan absensi (check-in dan check-out)
4. Login admin
5. Menambahkan karyawan ke sistem
6. Menampilkan laporan absensi
7. Menghapus data karyawan

Fungsi:
Sebagai tempat eksekusi dan pengujian semua class.

------------------------------------------------------------

8. ALUR SISTEM
Alur kerja sistem:
- Admin login
- Admin menambahkan karyawan
- Karyawan memiliki jabatan
- Karyawan melakukan absensi harian
- Sistem menyimpan data absensi
- Admin dapat melihat laporan absensi
- Admin dapat mengubah atau menghapus data karyawan

------------------------------------------------------------

9. KESIMPULAN
Program ini menerapkan konsep Object Oriented Programming (OOP) dalam bentuk sistem manajemen karyawan sederhana. Sistem ini menunjukkan hubungan antar class, penggunaan object, validasi data, dan pengelolaan data menggunakan list.

Tujuan program:
- Mengelola data karyawan
- Mencatat absensi karyawan
- Mengelola jabatan dan shift kerja
- Memberikan laporan kepada admin
