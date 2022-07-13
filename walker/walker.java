public class walker {
   private int distance;
   private int default_duration=10;

   // Construction Methods - Constructors
   public walker() {
       distance=0;
   }

   // Interface Methods
   public void change_default (int new_default) {
       default_duration=new_default;
   }

   public void walk(int velocity, int duration) {
       distance = distance + velocity * duration;
   }

   public void walk(int velocity) {
       distance = distance + velocity * default_duration;
   }

   public int distance_covered () {
       return distance;
   }

   // The main method - program entry point
   public static void main (String args[]) {
       walker A = new walker();
       walker B = new walker();
       A.walk(80, 5);
       B.walk(70, 5);
       A.change_default(20);
       A.walk(70);
       B.walk(75);
       System.out.println("A waler distance: " + A.distance_covered());
       System.out.println("B waler distance: " + B.distance_covered());
   }
}