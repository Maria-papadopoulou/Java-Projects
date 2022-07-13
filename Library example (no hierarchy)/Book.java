class Book {

	//attributes
    private String title;
    private String author;
    private String publisher;
    private String genre;
    
    //constructors
    public Book(String title, String author, String publisher, String genre) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.publisher = "Unknown";
        this.genre = "Unknown";
    }

    //getters and setters
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
    	return this.title;
    }

    public void setAuthor(String author) {
    	this.author = author;
    }

    public String getAuthor() {
    	return this.author;
    }

    //uncomment to test the overriden version of toString()
    // @Override
    // public String toString() {
    //     return "Title: " + this.title +
    //         "\nAuthor: "  +this.author +
    //         ", Publisher: " + this.publisher +
    //         ", Genre: " + this.genre;
    // }
  
}