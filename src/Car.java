public class Car extends Transport {
    private String statusRefill;
    private final float engineVolume;

    @Override
    protected void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
        if (gasoline || diesel || electro) {
            statusRefill = "заправлен";
        }else{
            statusRefill = "не заправлен";
        }
    }

    public Car(String brand, String model, int yearOut, String country, String color, int speedMax, float engineVolume) {
        super(brand, model, yearOut, country, color, speedMax);
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "engineVolume=" + engineVolume +
                "}" + super.toString() + statusRefill;
    }

}