package implementasion;

public class Mobil implements Kendaraan {
    @Override
    public String jenis(String data) {
        String a = data;
        System.out.println("data adalah : "+data);
        return a;
    }

    @Override
    public void insertNama() {
        System.out.println("tanpa return");

    }
}
