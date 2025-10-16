package enkapsulasi;
public class App {
    public static void main(String[] args) throws Exception {

        Person orang1 = new Person();
        orang1.setName("Alghifari");
        orang1.setAge(20);
        orang1.setalamat("Depok");

        System.out.println(orang1.getName());
        System.out.println(orang1.getAge());
        System.out.println(orang1.getalamat());
    }
}
