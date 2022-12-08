import java.text.DecimalFormat;

public class Flower {
    private final String flowerName;
    private final String country;
    private final double cost;
    private int lifeSpan;

    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public String getFlowerName() {
        return this.flowerName;
    }

    public String getCountry() {
        return this.country;
    }

    public double getCost() {
        return this.cost;
    }

    public int getLifeSpan() {
        return this.lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            flowerName = "Тип цветка не указан!";
        }
        this.flowerName = flowerName;
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";
        }
        this.country = country;

        if (cost <= 0) {
            cost = 1;
        }
        this.cost = cost;
        setLifeSpan(lifeSpan);
    }

    public Flower(String flowerName, String country, double cost) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            flowerName = "Тип цветка не указан!";
        }
        this.flowerName = flowerName;
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";
        }
        this.country = country;

        if (cost <= 0) {
            cost = 1;
        }
        this.cost = cost;
        this.lifeSpan = 3;
    }

    public Flower(String flowerName, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            flowerName = "Тип цветка не указан!";
        }
        this.flowerName = flowerName;
        this.country = "Россия";

        if (cost <= 0) {
            cost = 1;
        }
        this.cost = cost;
        setLifeSpan(lifeSpan);
    }


    public String toString() {
        return getFlowerName() + " страна происхождения  " + country + " ,стоимость штуки  " + decimalFormat.format(cost)
                + " рублей, срок стояния - " + lifeSpan;

    }
}
