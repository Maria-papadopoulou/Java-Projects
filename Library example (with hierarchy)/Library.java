public class Library {

     public static void main(String []args){

        //create some objects using diffrent constructors

        Novel novel = new Novel("The lord of the rings",
                            "J.R.R Tolkien",
                            "George Allen and Unwin",
                            "Fantasy");
                            
        Poem poem = new Poem("The Iliad",
                            "Homer",
                            "Dactylic Hexameter");


        Novel novel1 = new Novel();
        novel1.setTitle("Introduction to Java Programming");
        novel1.setAuthor("Y. Daniel Liang");

        Poem poem1 = new Poem();
        poem1.setTitle("Odyssey");

        //test these objects using their methods       
        System.out.println(novel.toString());
        System.out.println("**********************");
        System.out.println(poem.toString());
        System.out.println("**********************");
        System.out.println(novel1.toString());
        System.out.println("**********************");
        System.out.println(poem1.toString());

     }
}