import java.time.LocalTime;

public class Shift {
    private String nama;
    private LocalTime jamMulai;
    private LocalTime jamSelesai;
    private int toleransiTerlambat;

    public Shift(String nama, LocalTime jamMulai,
                 LocalTime jamSelesai, int toleransiTerlambat) {

        this.nama = nama;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.toleransiTerlambat = toleransiTerlambat;
    }

    public String getNama() {
        return nama;
    }

    public LocalTime getJamMulai() {
        return jamMulai;
    }

    public LocalTime getJamSelesai() {
        return jamSelesai;
    }

    public int getToleransiTerlambat() {
        return toleransiTerlambat;
    }
}