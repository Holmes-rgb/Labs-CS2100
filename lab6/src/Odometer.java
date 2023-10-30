public class Odometer {
    private int mileage;
    public static final int MAXIMUM_MILEAGE = 999999;

    private void setMileage(int m) {
        if (m < 0){
            mileage = Math.abs(m);
        }
        if (m > MAXIMUM_MILEAGE){
            mileage = m - MAXIMUM_MILEAGE;
        }
        else {
            mileage = m;
        }
    }
    public Odometer(int mileage){
        this.setMileage(mileage);
    }

    public int getMileage() {
        return mileage;
    }

    public void addMileage(int milesDriven){
        setMileage(this.getMileage() + milesDriven);
    }

    @Override
    public String toString() {
        return String.format("Mileage: %d miles",getMileage());
    }
}
