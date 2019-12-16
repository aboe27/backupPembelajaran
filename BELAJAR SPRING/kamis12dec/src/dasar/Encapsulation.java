package dasar;

public class Encapsulation {
    private int id;
    protected int nik;
    public String nama;

    int getId(){
        int nid=1;
        id = nid;
        return id;
    }

    protected int getNik(){
        return id;

    }
}
