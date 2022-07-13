class Novel extends Literature{

    //subclass attributes
    private String publisher;
    private String genre;
    
    //constructors
    public Novel(String title, String author, String publisher, String genre) {
        //even if we don't explicitly call super(),
        //it is automatically called by the compiler.
        //if default constructor in not present in superclass 
        //then we have compile error
        //super();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }


    public Novel() {
        //even if we don't explicitly call super(),
        //it is automatically called by the compiler.
        //if default constructor in not present in superclass 
        //then we have compile error
        //super();
        this.publisher = UNKNOWN_VALUE;
        this.genre = UNKNOWN_VALUE;
    }
    
    //overriden method inherited from Literature
    @Override
    public String toString() {
        return "Title: " + this.title
          + "\nAuthor: " + this.author
          + ", Publisher: " + this.publisher 
          + ", Genre: " + this.genre;
    }

    
}