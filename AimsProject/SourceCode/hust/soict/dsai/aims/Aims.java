package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

        Cart anOrder = new Cart();


        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski", 136, 20.00f);


        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2);
        anOrder.addMedia(dvd3);
        anOrder.addMedia(dvd4);


        System.out.println("\n--- Giỏ hàng hiện tại ---");
        anOrder.print();


        System.out.println("\n--- Bắt đầu xóa đĩa ---");
        anOrder.removeMedia(dvd2);
        

        System.out.println("\n--- Giỏ hàng sau khi cập nhật ---");
        anOrder.print();
    }
}