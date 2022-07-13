public class Library {

     public static void main(String args[]){

        //create some objects using diffrent constructors

        Novel novel = new Novel("The Lord of the Rings",
                            "J.R.R Tolkien",
                            "George Allen and Unwin",
                            "Fantasy");
                            
        Poem poem = new Poem("The Iliad",
                            "Homer",
                            "Dactylic Hexameter");
        
        
        Novel novel1 = new Novel();
        novel1.setTitle("Intro to Java");
        
        Poem poem1 = new Poem();
        poem1.setTitle("Odyssey");


        //test these objects using their methods
        System.out.println("Title: " + novel.getTitle());
        System.out.println("Author: " + novel.getAuthor());
        System.out.println("**********************");

        System.out.println("Title: " + poem.getTitle());
        System.out.println("Author: " + poem.getAuthor());
        System.out.println("**********************");

        System.out.println("Title: " + novel1.getTitle());
        System.out.println("Author: " + novel1.getAuthor());
        System.out.println("**********************");

        System.out.println("Title: " + poem1.getTitle());
        System.out.println("Author: " + poem1.getAuthor());
        System.out.println("**********************");

        //test toString() method inherited from Object
        System.out.println("Novel info: " + novel.toString());
        System.out.println("**********************");
        System.out.println("Poem info: " + poem.toString());
     }
}