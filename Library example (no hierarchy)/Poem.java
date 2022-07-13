class Poem {

    //attributes
    private String title;
    private String author;
    private String style;
    
    //constructors
    public Poem(String title, String author, String style) {
        this.title = title;
        this.author = author;
        this.style = style;
    }

    public Poem() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.style = "Unknown";
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
    //         "\nAuthor: "  +this.author;
    // }
    
}