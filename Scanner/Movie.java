/*
    Represents a movie object accroding to the records found in datafile.txt
*/
public class Movie {
    
    private String title;
    private String category;
    private String runningTime;
    private int year;
    private double price;

    public Movie(String title, String category, String runningTime, int year, double price) {
        this.title = title;
        this.category = category;
        this.runningTime = runningTime;
        this.year = year;
        this.price = price;
    }

   
    @Override
    public String toString() {
        return title + "#" + category + "#" + runningTime + "#"
                    + year + "#" + price;
    }
    
    
}