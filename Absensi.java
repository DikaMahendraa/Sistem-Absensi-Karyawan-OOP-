import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Absensi {

    private LocalDate tanggal;
    private LocalTime jamMasuk;
    private LocalTime jamKeluar;
    private String status;
    private String keterangan;

    public Absensi(LocalDate tanggal, String status, String keterangan) {
        this.tanggal = tanggal;
        this.status = status;
        this.keterangan = keterangan;
    }

    public void checkIn(LocalTime jam) {
        this.jamMasuk = jam;
    }

    public void checkOut(LocalTime jam) {
        this.jamKeluar = jam;
    }

    public long hitungDurasi() {
        if (jamMasuk != null && jamKeluar != null) {
            return Duration.between(jamMasuk, jamKeluar).toHours();
        }
        return 0;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public LocalTime getJamMasuk() {
        return jamMasuk;
    }

    public LocalTime getJamKeluar() {
        return jamKeluar;
    }

    public String getStatus() {
        return status;
    }
}