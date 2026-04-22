package AimsProject;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Swap {
    public static void main(String[] args) {
 
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        
        DigitalVideoDisc[] dvdArray = {jungleDVD, cinderellaDVD};

        System.out.println("--- BEFORE SWAP ---");
        System.out.println("Position 0: " + dvdArray[0].getTitle());
        System.out.println("Position 1: " + dvdArray[1].getTitle());

  
        swap(dvdArray);

        System.out.println("\n--- AFTER SWAP ---");
        System.out.println("Position 0: " + dvdArray[0].getTitle());
        System.out.println("Position 1: " + dvdArray[1].getTitle());
    }

  
    public static void swap(DigitalVideoDisc[] dvdList) {
        if (dvdList != null && dvdList.length >= 2) {
            DigitalVideoDisc tmp = dvdList[0];
            dvdList[0] = dvdList[1];
            dvdList[1] = tmp;
        }
    }
}