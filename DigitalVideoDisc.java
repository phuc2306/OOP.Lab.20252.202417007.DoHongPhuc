package AimsProject;

public class DigitalVideoDisc {
 
    private String title;
    private String director;
    private int length;
    private float cost;
    private int id; 
    private String category;

  
    private static int nbDigitalVideoDiscs = 0; 


    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.director = director;
        this.length = length;
        this.cost = cost;
   
        nbDigitalVideoDiscs++;
   
        this.id = nbDigitalVideoDiscs;
    }

    
    public int getId() { return id; }
    public String getTitle() { return title; }
    public float getCost() { return cost; }


    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
}