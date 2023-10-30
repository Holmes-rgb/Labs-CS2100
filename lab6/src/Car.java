public class Car {
    private String make;
    private String model;
    private FuelGauge fuelGauge;
    private Odometer odometer;
    private int mpg;

    public Car(String make, String model, FuelGauge fuelGauge, Odometer odometer, int mpg){
        this.make = make;
        this.model = model;
        this.fuelGauge = fuelGauge;
        this.odometer = odometer;
        this.mpg = mpg;
    }

    public Car(String make, String model, int mpg){
        this.make = make;
        this.model = model;
        this.mpg = mpg;
        this.odometer = new Odometer(0);
        this.fuelGauge = new FuelGauge();

    }

    public FuelGauge getFuelGauge() {
        return fuelGauge;
    }

    public Odometer getOdometer() {
        return odometer;
    }

    public int getMpg() {
        return mpg;
    }

    public void drive(int milesDriven){
        this.getOdometer().addMileage(milesDriven);

        int galBurned = milesDriven / this.mpg;

        for(int i = 0; i < (galBurned); i++){
            this.getFuelGauge().burn();
        }
    }

    public void fill(){
        while(!fuelGauge.isFull()){
            this.getFuelGauge().fill();
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s\n Gas: %d gallons\n Mileage: %d miles", make, model, this.getFuelGauge().getGallons(), this.getOdometer().getMileage());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Car other = (Car)obj;
        return (mpg == other.mpg && this.getFuelGauge().getGallons() == other.getFuelGauge().getGallons() && odometer.getMileage() == other.getOdometer().getMileage() );
    }
}
