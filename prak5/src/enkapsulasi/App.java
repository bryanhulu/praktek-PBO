package enkapsulasi;
public class App {
    public static void main(String[] args) throws Exception {

        Person orang1 = new Person();
        orang1.setNama("Alghifari");
        orang1.setUmur(20);
        orang1.setAlamat("Depok");

        System.out.println(orang1.getNama());
        System.out.println(orang1.getUmur());
        System.out.println(orang1.getAlamat());
    }
}
