public class app {
 public static void main(String[] args) throws Exception {
      iphone iphone1 = new iphone("RED","128GB");       
      iphone iphone2 = new iphone("GOLD","256GB");

    
    iphone1.nyala();
    iphone1.mati();
    iphone1.berdering();
    iphone1.memori(); 
    iphone1.videoCall();
    iphone1.info();

System.out.println("\n");

    iphone2.nyala();
    iphone2.mati();

    iphone2.berdering();
    iphone2.memori();

    iphone2.videoCall();
    iphone2.info();
 }
    
}
    
