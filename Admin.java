import java.util.List;

public class Admin {

    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username)
                && this.password.equals(password);
    }

    public void tambahKaryawan(List<Karyawan> daftar,
                                Karyawan karyawan) {

        daftar.add(karyawan);
        System.out.println("Karyawan berhasil ditambahkan");
    }

    public void updateKaryawan(Karyawan karyawan,
                               String alamatBaru) {

        karyawan.setAlamat(alamatBaru);
    }

    public void hapusKaryawan(List<Karyawan> daftar,
                              Karyawan karyawan) {

        daftar.remove(karyawan);
    }

    public void aturShiftKaryawan() {
        System.out.println("Shift berhasil diatur");
    }

    public void lihatLaporanAbsensi(Karyawan karyawan) {

        for (Absensi a : karyawan.listAbsensi()) {
            System.out.println(
                    a.getTanggal() + " - " +
                    a.getStatus()
            );
        }
    }
}