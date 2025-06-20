public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");
        Image image2 = new ProxyImage("mountain.png");

       
        image1.display();
        System.out.println();

    
        image1.display();
        System.out.println();

        image2.display();
    }
}
