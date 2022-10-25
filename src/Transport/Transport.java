package Transport;

public abstract class Transport {

    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;
    private String fuel;
    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     String fuel) {
        this(brand, model, productionYear, productionCountry, color ,0, fuel);
    }
    public Transport (String brand,
                      String model,
                      int productionYear,
                      String productionCountry,
                      String color,
                      int maxSpeed,
                      String fuel) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setMaxSpeed(maxSpeed);
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        if (fuel == null || fuel.isBlank()) {
            this.fuel = "default";
        } else {
            this.fuel = fuel;
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }
    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
    }
    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }
    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 0);
    }
    public abstract void refill();
}