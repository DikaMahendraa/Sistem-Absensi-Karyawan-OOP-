import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Karyawan {

    private String nama;
    private String alamat;
    private String email;
    private LocalDate tanggalMasuk;
    private Jabatan jabatan;

    private List<Absensi> listAbsensi;

    public Karyawan(String nama, String alamat,
                     String email, LocalDate tanggalMasuk,
                     Jabatan jabatan) {

        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.tanggalMasuk = tanggalMasuk;
        this.jabatan = jabatan;

        listAbsensi = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    public List<Absensi> listAbsensi() {
        return listAbsensi;
    }

    public void tambahAbsensi(Absensi absensi) {
        listAbsensi.add(absensi);
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

