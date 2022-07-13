class Literature {

    //superclass attributes
	String title;
    String author;

    //constant value
    public static final String UNKNOWN_VALUE = "Unknown";

    //constructors
    public Literature(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Literature() {
        this.title = UNKNOWN_VALUE;
        this.author = UNKNOWN_VALUE;
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

    //overriden method inherited from Object
    @Override
    public String toString() {
        return "Title: " +  this.title 
            + "\nAuthor: " + this.author;
    }
}