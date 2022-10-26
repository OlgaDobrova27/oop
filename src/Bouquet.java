public class Bouquet {
    private  Flower[] flowers;

    public Flower[] getFlowers() {
        return flowers;
    }
    public Bouquet(Flower[] flowers){
        this.flowers = flowers;
    }
    public int getExpiryDays(Flower[] flowers) {
        int expiryDays = Integer.MAX_VALUE;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers != null) {
                if (flowers[i].getLifeSpan() < expiryDays) {
                    expiryDays = flowers[i].getLifeSpan();
                }
            }
        }
        return expiryDays;
    }


    public double getCost(Flower[] flowers){
        double sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getCost();
        }
        double result = sum + sum*0.1;
        return result;
    }
}