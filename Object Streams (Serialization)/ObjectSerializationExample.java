import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author aggelos
 */
public class ObjectSerializationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String file = "serialized.dat";

        Car car = new Car("ZZK3600", "BMW", "X1", "Black", 2014);
        car.setColor("White");
        System.out.println("Car (initial): " + car.toString());
        serialize(car, file);

        Car car1 = deserialize(file);
        System.out.println("Car (deserialized): " + car1.toString());
    }

    /*
        Serializes a car object and stores it to a file
    */
    static void serialize(Car car, String file) {
        try {
            //FileOutputStream outFile = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(car);
            out.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /*
        Deserializes an object found inside a file and returns a Car object.
    */
    static Car deserialize(String file) {
        Car car = null;
        try {
            //FileInputStream inFile = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            car = (Car) in.readObject();
            in.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        return car;
    }

}
