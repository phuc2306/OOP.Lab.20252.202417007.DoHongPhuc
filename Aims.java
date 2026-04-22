package AimsProject;


public class Aims {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart anOrder = new Cart();

        // Tạo các đĩa DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski", 136, 20.00f);


System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
}}
        // Test 1: Thêm 2 đĩa cùng lúc
        System.out.println("--- TEST: ADD 2 DVDS ---");
        anOrder.addDigitalVideoDisc(dvd1, dvd2);

        // Test 2: Thêm 1 mảng đĩa
        System.out.println("\n--- TEST: ADD AN ARRAY OF DVDS ---");
        DigitalVideoDisc[] dvdList = {dvd3, dvd4};
        anOrder.addDigitalVideoDisc(dvdList);
    }
}
