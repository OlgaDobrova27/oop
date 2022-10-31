public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private Integer lifeSpan;
    private String name;

    public Flower(String name, String country, String flowerColor, double cost, int lifeSpan) {
        this.name = name;
        setCountry(country);
        setFlowerColor(flowerColor);
        this.cost = cost;
        setLifeSpan(lifeSpan);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor){
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public void showInfo() {
        System.out.printf("%s, страна происхождения %s, стоимость %.2f, %s цвета, срок стояния %d дней\n", name, country, cost, flowerColor, lifeSpan);
    }
}