package AimsProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; 
    private int qtyOrdered = 0;
    public int getQtyOrdered() { 
        return qtyOrdered;
    }
    public int getMaxNumbersOrdered() { 
        return MAX_NUMBERS_ORDERED;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) { 
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full"); 
        }
    }
 // 2.1. Overloading bằng mảng 
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                addDigitalVideoDisc(disc); 
            } else {
                System.out.println("The cart is full. Cannot add: " + disc.getTitle());
                break; 
            }
        }
    }
 // 2.2. Overloading bằng cách thay đổi số lượng tham số 
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
            addDigitalVideoDisc(dvd1);
            addDigitalVideoDisc(dvd2);
        } else {
            System.out.println("The cart does not have enough space for 2 discs.");
        }
    }
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}   
