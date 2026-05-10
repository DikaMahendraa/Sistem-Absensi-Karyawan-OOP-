import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Jabatan jabatan =
                new Jabatan("Programmer", "Membuat sistem");

        Karyawan karyawan =
                new Karyawan(
                        "Dika",
                        "Denpasar",
                        "dika@gmail.com",
                        LocalDate.now(),
                        jabatan
                );

        Absensi absensi =
                new Absensi(
                        LocalDate.now(),
                        "Hadir",
                        "Masuk tepat waktu"
                );

        absensi.checkIn(LocalTime.of(8, 0));
        absensi.checkOut(LocalTime.of(17, 0));

        karyawan.tambahAbsensi(absensi);

        Admin admin = new Admin("admin", "123");

        if (admin.login("admin", "123")) {
            System.out.println("Login berhasil");
        }

        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Jabatan: "
                + karyawan.getJabatan().getNama());
        System.out.println("Status: "
                + absensi.getStatus());
        System.out.println("Durasi kerja: "
                + absensi.hitungDurasi()
                + " jam");

        admin.lihatLaporanAbsensi(karyawan);
    }
}