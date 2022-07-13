public class Sphere {
    
    //attributes
    private double radius;

    //constructors    
    public Sphere() {
        this.radius = 0;
    }

    public Sphere(double radius) {
    	if (radius >= 0) {
        	this.radius = radius;
    	} else {
    		this.radius = 0;
    	}
    }
    
    //methods
    public void setRadius(double radius) {
        if (radius >= 0) {
        	this.radius = radius;
    	} 
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double calculateDiameter() {
        return 2*radius;
    }
    
    public double calculateCircumference() {
        return 2*radius*Math.PI;
    }
    
    public double calculateArea() {
        return 4*Math.PI*Math.pow(radius, 2);
    }
    
    public double calculateVolume() {
        return (4/3)*Math.PI*Math.pow(radius, 3);
    }
    
}