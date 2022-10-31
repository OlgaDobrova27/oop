public class Bus extends Transport {

    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color, int maxSpeed, String typeMotor) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, typeMotor);
    }

    @Override
    public void refill(String typeMotor) {
        if (typeMotor == "diesel") {
            System.out.println("Автобус " + getBrand() + " следует заправлять дизелем на заправке");
        } else {
            System.out.println("Автобус " + getBrand() + " следует заправлять бензином на заправке");
        }
    }

    @Override
    protected void refill(Boolean gasoline, Boolean diesel, Boolean electro) {

    }

    @Override
    public String toString() {
        return "Bus" + " " +
                getBrand() + " " +
                getModel() + ", цвет кузова " +
                getColor() + ", максимальная скорость " +
                getMaxSpeed() + "км/ч, " +
                getProductionYear() + " год, производство " +
                getProductionCountry() + ", тип мотора " + getTypeMotor();
    }
}
