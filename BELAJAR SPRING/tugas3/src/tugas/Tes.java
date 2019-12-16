package tugas;

public class Tes {
    public static void kk() {
        try {
            Karyawan karyawan = new Karyawan();
            karyawan.setNakar(null);
            System.out.println(karyawan.getNakar().length());
        } catch (java.lang.Exception kesalahan) {
            kesalahan.printStackTrace();

        }

    }
}
