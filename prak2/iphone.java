public class iphone {
    String color;
    String storage;

    iphone(String color, String storage){
        this.color = color;
        this.storage = storage;

    }
    public void nyala(){
        System.out.println("iphone warna " + this.color + " menyala");
    }
    public void mati(){
        System.out.println("iphone warna " + this.color + " mati");
    }
    public void berdering (){
        System.out.println("iphone warna " + this.color + " berdering");
    }
    public void memori (){
        System.out.println("iphone warna " + this.color + " memori iphone sebesar " + this.storage);
    }
    public void videoCall (){
        System.out.println("iphone warna " + this.color + " video call");
    }
    public void info(){
}
}
