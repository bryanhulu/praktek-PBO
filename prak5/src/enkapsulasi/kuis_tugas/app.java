package enkapsulasi.kuis_tugas;

public class app {
    public static void main(String[] args) throws Exception {

        kucing kucing1 = new kucing();
        kucing1.setNama("Kucing");
        kucing1.setUmur("2 tahun");
        kucing1.setAktivitas("Sedang bemain");

        System.out.println(kucing1.getNama() + kucing1.getUmur() + kucing1.getAktivitas());
    }
    
}
