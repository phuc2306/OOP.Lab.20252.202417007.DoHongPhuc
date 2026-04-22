package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private static final String String = null;
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id; 
    private static int nbDigitalVideoDiscs = 0; 

    private void updateTotalAndId() {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }


    public DigitalVideoDisc(String title) {
        this.title = title;
        updateTotalAndId();
    }


    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        updateTotalAndId();
    }


    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        updateTotalAndId();
    }


    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }
    public int getId() { return id; }
    
    public void setTitle(String title) { this.title = title; 
    String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }}
}