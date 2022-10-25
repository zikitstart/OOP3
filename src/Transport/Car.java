package Transport;

import java.time.LocalDate;

public class Car extends Transport {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key() {
            this(false,false);
        }
        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean getKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate insuranceValidityPeriod;
        private final double theCostOfInsurance;
        private final String insuranceNumber;

        public Insurance(LocalDate insuranceValidityPeriod, double theCostOfInsurance, String insuranceNumber) {
            if (insuranceValidityPeriod == null) {
                this.insuranceValidityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
            if (theCostOfInsurance <= 0.0) {
                this.theCostOfInsurance = 0.0;
            } else {
                this.theCostOfInsurance = theCostOfInsurance;
            }
            if (insuranceNumber == null) {
                this.insuranceNumber = "default";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }
        public Insurance() {
            this(null,3_000D,null);
        }
        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }
        public double getTheCostOfInsurance() {
            return theCostOfInsurance;
        }
        public String getInsuranceNumber() {
            return insuranceNumber;
        }
        public void checkInsuranceValidityPeriod() {
            if (insuranceValidityPeriod.isBefore(LocalDate.now()) || insuranceValidityPeriod.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку.!");
            }
        }
        public void checkInsuranceNumber() {
            if (insuranceNumber.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String rubberType;
    private Key key;
    private Insurance insurance;
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               String rubberType,
               Key key,
               Insurance insurance,
               String fuel) {
        super(brand, model, productionYear, productionCountry, color,fuel);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setKey(key);
        setInsurance(insurance);
        setRubberType(rubberType);
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 1;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               String rubberType ,
               Key key,
               Insurance insurance,
               int maxSpeed,
               String fuel) {
        super(brand, model, productionYear, color, productionCountry, maxSpeed,fuel);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setKey(key);
        setInsurance(insurance);
        setRubberType(rubberType);
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 1;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public Object changeRubber() {
        if (rubberType.equals("летняя")) {
            rubberType = "зимняя";
        } else {
            rubberType = "летняя";
        }
        return rubberType;
    }
    public boolean correctRegistrationNumber() {
        if (registrationNumber.length() != 9){
            return false;
        }
        char [] chars = registrationNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0])||!Character.isAlphabetic(chars[4])||!Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1])||!Character.isDigit(chars[2])||!Character.isDigit(chars[3])||!Character.isDigit(chars[6])||!Character.isDigit(chars[7])||!Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public String getRubberType() {
        return rubberType;
    }
    public Key getKey() {
        return key;
    }
    public Insurance getInsurance() {
        return insurance;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "(х000хх000)";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    public void setRubberType(String rubberType) {
        if (rubberType == null || rubberType.isBlank()) {
            this.rubberType = "default";
        } else {
            this.rubberType = rubberType;
        }
    }
    public void setKey(Key key) {
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }
    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }
    @Override
    public void refill() {
        if (getFuel().equals("Дизель")) {
            System.out.println("Нужно заправлять дизельным топливом");
        } else if (getFuel().equals("Бензин")) {
            System.out.println("Нужно заправлять бензином");
        } else if (getFuel().equals("Электричество")) {
            System.out.println("Нужно заряжать на специальных электроду-парковках");
        } else {
            System.out.println("Топливо указано некорректно!");
        }
    }
}