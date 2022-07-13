public class SphereTest{

     public static void main(String []args){
         
         Sphere s1 = new Sphere(10);
         System.out.println("Sphere S1 of radius " + s1.getRadius() + " cm");
         System.out.println("S1 Diameter: " + s1.calculateDiameter());
         System.out.println("S1 Circumfernece: " + s1.calculateCircumference());
         System.out.println("S1 Area: " + s1.calculateArea());
         System.out.println("S1 Volume: " + s1.calculateVolume());
         
         s1.setRadius(20);
         System.out.println("Sphere S1 new radius " + s1.getRadius() + " cm");
         System.out.println("S1 new Area: " + s1.calculateArea());

         s1.setRadius(-5);
         System.out.println("Sphere S1 new radius " + s1.getRadius() + " cm");
         System.out.println("S1 new Area: " + s1.calculateArea());
     }
}