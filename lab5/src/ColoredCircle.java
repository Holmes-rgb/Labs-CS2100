public class ColoredCircle {
    double radius;
    String color;

    /**
     * Method to return the radius of circle object
     * @return the radius as a double
     */
    public double getRadius(){
        return radius;
    }

    /**
     * Set the radius of a circle object
     * @param r wanted radius as a double
     */
    public void setRadius(double r){
        radius = Math.abs(r);
    }

    /**
     * get the color of a circle object
     * @return returns the color of the circle as a string
     */
    public String getColor(){
        return color;
    }

    /**
     * set the color of a circle object
     * @param c wanted color of the circle as a string
     */
    public void setColor(String c){
        color = c;
    }

    /**
     * Get the area of the circle object
     * @return the area of the circle
     */
    public double getArea(){
        return Math.PI * (Math.pow(this.getRadius(), 2));
    }

    /**
     * Constructor for a default circle of radius 1.0 and color blue
     */
    public ColoredCircle(){
        setRadius(1.0);
        setColor("blue");
    }

    /**
     * Constructor for a circle with a known radius (default color blue)
     * @param r known radius as a double
     */
    public ColoredCircle(double r){
        setRadius(Math.abs(r));
        setColor("blue");
    }

    /**
     * Constructor for circle with known color (default radius 1.0)
     * @param c known color as a string
     */
    public ColoredCircle(String c){
        setRadius(1.0);
        setColor(c);
    }

    /**
     * Constructor for circle with known radius and known color
     * @param r known radius as a double
     * @param c known color as a string
     */
    public ColoredCircle(double r, String c){
        setRadius(Math.abs(r));
        setColor(c);
    }
}