public class FuelGauge {
    private int gallons;
    private static final int MAXIMUM_NUMBER_OF_GALLONS = 15;
    FuelGauge(){
        gallons = MAXIMUM_NUMBER_OF_GALLONS;
    }
    FuelGauge(int gallons){
        if (Math.abs(gallons) <= 15){
            this.gallons = Math.abs(gallons);
        }
        else{
            this.gallons = MAXIMUM_NUMBER_OF_GALLONS;
        }
    }

    public int getGallons() {
        return gallons;
    }

    public boolean burn(){
        if (gallons > 0){
            gallons -= 1;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean fill(){
        if (gallons < MAXIMUM_NUMBER_OF_GALLONS){
            gallons++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        return (gallons == 0);
    }

    public boolean isFull(){
      return (gallons == MAXIMUM_NUMBER_OF_GALLONS);
    }

    @Override
    public String toString() {
        return String.format("Gas: %d gallons", getGallons());
    }

    @Override
    public boolean equals(Object obj) {
        FuelGauge gage = (FuelGauge)obj;
        return (this.getGallons() == gage.getGallons());
    }


}