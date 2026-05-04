public class MahasiswaKu {

    public static void main(String[] args) {
        Mahasiswa <String,String,Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
    public static class Mahasiswa<N, Nm, C> {
    // Variabel dengan tipe generic
    private N nim;
    private Nm name;
    private C clas; 

    // Setter dan Getter untuk Nim
    public void setNim(N nim) {
        this.nim = nim;
    }

    public N getNim() {
        return nim;
    }

    // Setter dan Getter untuk Name
    public void setName(Nm name) {
        this.name = name;
    }

    public Nm getName() {
        return name;
    }

    // Setter dan Getter untuk Clas
    public void setClas(C clas) {
        this.clas = clas;
    }

    public C getClas() {
        return clas;
    }
}
}