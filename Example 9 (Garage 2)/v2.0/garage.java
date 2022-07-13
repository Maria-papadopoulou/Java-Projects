class car {
   int seats;
   String color;
   String id;

   //constructors
   public car () {
      seats=4;
      color="white";
   }

   public car (String c) {
      seats=4;
      color=c;
   }

   public car (int s) {
      seats=s;
      color="white";
   }

   //methods
   int getSeats () {
      return seats;
   }

   String getColor () {
      return color;
   }

   void repaint (String newColor) {
      color=newColor;
   }

   void setId (String newId) {
      id=newId;
   }

   void display() {
      System.out.println(this.toString());
   }
}

public class garage {

   public static void main(String args[]) {
      car acar, bcar, ccar, dcar, ecar;

      acar=new car();
      bcar=new car("red");
      ccar=new car(3);
      dcar=new car(5);

      acar.display();
      bcar.display();
      ccar.display();
      dcar.display();

      acar.repaint("green");
      ccar.repaint("yellow");
      dcar.setId("ZKL 5737");

      acar.display();
      bcar.display();
      ccar.display();
      dcar.display();
   }
}
