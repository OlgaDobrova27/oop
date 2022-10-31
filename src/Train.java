import java.time.LocalTime;

public class Train extends Transport{
    private double ticketPrice;
    private int time;
    private String startStop;
    private String finalStop;
    private int quantityWagons;

    public Train(String brand, String model, Integer productionYear, String productionCountry, String color, int maxSpeed, double ticketPrice, int time, String startStop, String finalStop, int quantityWagons, String typeMotor) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, typeMotor);
        setFinalStop(finalStop);
        setTime(time);
        setQuantityWagons(quantityWagons);
        setTicketPrice(ticketPrice);
        setStartStop(startStop);
    }
    @Override
    public void refill(String typeMotor) {
        System.out.println("Автобус " + getBrand() + " следует заправлять дизелем на заправке");
    }

    @Override
    protected void refill(Boolean gasoline, Boolean diesel, Boolean electro) {

    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice <0){
            this.ticketPrice = Math.abs(ticketPrice);
            return;
        }
        this.ticketPrice = ticketPrice;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time <0) {
            this.time = Math.abs(time);
        } else if (time == 0){
            System.out.println("Время не указано!");
        } else {
            this.time = time;
        }
    }

    public String getStartStop() {
        return startStop;
    }

    public void setStartStop(String startStop) {
        if (startStop == null || startStop.isEmpty() || startStop.isBlank()) {
            System.out.println("приносим извинения, технические работы");
            return;
        }
        this.startStop = startStop;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop == null || finalStop.isEmpty() || finalStop.isBlank()){
            System.out.println("приносим извинения, технические работы");
            return;
        }
        this.finalStop = finalStop;
    }

    public int getQuantityWagons() {
        return quantityWagons;
    }

    public void setQuantityWagons(int quantityWagons) {
        if (quantityWagons <0){
            this.quantityWagons = Math.abs(quantityWagons);
            return;
        }
        this.quantityWagons = quantityWagons;
    }

    @Override
    public String toString() {
        return "Train " +
                getBrand() + " модель " +
                getModel() + ", год выпуска " +
                getProductionYear() + ", страна производитель " +
                getProductionCountry() + " цвет " +
                getColor() +  ", максимальная скорость " +
                getMaxSpeed() + " км/ч, стоимость билета составляет " +
                ticketPrice + "рублей, время в пути " +
                time + " минут, отходит от станции " +
                startStop + ", следует до станции " +
                finalStop + ",  в поезде " + quantityWagons + " вагонов, " + "тип мотора " + getTypeMotor();
    }


}
