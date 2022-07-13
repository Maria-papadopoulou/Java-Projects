import java.io.Serializable;

/**
 *
 * @author aggelos
 */
public class Car implements Serializable {
    
    private String vin;
    private String make;
    private String model;
    private String color;
    private int year;
    
    public Car(String vin, String make, String model, String color, int year) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
    @Override
    public String toString() {
        return String.format("%d %s %s %s, vin:%s",
            year, color, make, model, vin);
    }
    
}
