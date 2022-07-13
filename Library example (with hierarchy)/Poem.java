class Poem extends Literature {

    //subclass attributes
    private String style;
    
    public Poem(String title, String author, String style) {
        //even if we don't explicitly call super(),
        //it is automatically called by the compiler.
        //if default constructor in not present in superclass 
        //then we have compile error
        //super();
        this.title = title;
        this.author =author;
        this.style = style;
    }

    public Poem() {
        //even if we don't explicitly call super(),
        //it is automatically called by the compiler.
        //if default constructor in not present in superclass 
        //then we have compile error
        //super();
        this.style = UNKNOWN_VALUE;
    }


    //overriden method inherited from Literature
    @Override
    public String toString() {
        return "Title: " + this.title
          + "\nAuthor: " + this.author
          + ", Style: " + this.style; 
    }
}