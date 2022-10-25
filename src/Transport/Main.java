package Transport;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","Grande",1.7,"жёлтый",2015,"Россия","механическая","седан","р156ор078",5,"летняя",new Car.Key(false,false),new Car.Insurance(null,2_000,"325684265"), 250,"Дизель");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия","механическая","седан","р150ор078",4,"зимняя",new Car.Key(true,false),new Car.Insurance(null,7_000,"852456951"), 250,"Бензин");
        Car bmw = new Car("BMW","Z8",3.0,"черный",2021,"Германия","механическая","седан","р656ор078",5,"летняя",new Car.Key(false,true),new Car.Insurance(null,2_000,null), 250,"Бензин");
        Car kia = new Car("Kia","Sportage 4",2.4,"красный",2018,"Южная Корея","автомат","седан","р186ор078",4,"зимняя",new Car.Key(false,true),new Car.Insurance(null,6_000,null),"Электричество");
        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея","механическая","седан","р276ор078",5,"летняя",new Car.Key(true,true),new Car.Insurance(null,9_000,null),"Дизель");

        System.out.println("##################");
        printCar(lada);
        lada.refill();
        printCar(audi);
        audi.refill();
        printCar(bmw);
        bmw.refill();
        printCar(kia);
        kia.refill();
        printCar(hyundai);
        hyundai.refill();
        System.out.println("##################");


        Train lastochka = new Train("Ласточка",
                "B-901",
                2011,
                "России",
                null,
                301,
                3550,
                null,
                "Белорусского вокзала",
                "Минск-Пассажирский",
                11,
                "Дизель");
        Train leningrad = new Train("Ленинград",
                "D-125",
                2019,
                "России",
                null,
                270,
                1700,
                null,
                "Ленинградского вокзала",
                "Ленинград-Пассажирский",
                8,
                "Дизель");


        System.out.println(lastochka);
        lastochka.refill();
        System.out.println(leningrad);
        lastochka.refill();
        System.out.println("##################");

        Bus bus1 = new Bus("Hyundai",
                "Н350",
                2018,
                "России",
                "серый",
                170,
                "Дизель");
        Bus bus2 = new Bus("Kia",
                "Н508",
                2018,
                "России",
                "расный",
                160,
                "Бензин");
        Bus bus3 = new Bus("Audi",
                "M500",
                2020,
                "России",
                "cbybq",
                150,
                "Дизель");


        System.out.println(bus1);
        bus1.refill();
        System.out.println(bus2);
        bus2.refill();
        System.out.println(bus3);
        bus3.refill();
        System.out.println("##################");

    }
    public static void printCar(Car car) {
        System.out.println(car.getBrand() + " " +
                car.getModel() + ", " +
                car.getProductionYear() + " год выпуска, страна сборки " +
                car.getProductionCountry() + "," +
                car.getColor() + " цвет, объем двигателя - " +
                car.getEngineVolume() + " литра. Коробка передач " +
                car.getTransmission() + ", тип кузова " +
                car.getBodyType() +  ". Регистрационный номер " +
                car.getRegistrationNumber() + " , мест " +
                car.getNumberOfSeats() + " , тип резины " +
                car.getRubberType() + " , тип запуска " +
                car.getKey().getRemoteEngineStart() + " , бесключевой доступ " +
                car.getKey().getKeylessAccess() + " , Срок действия страховки " +
                car.getInsurance().getInsuranceValidityPeriod() + " , Стоимость страховки " +
                car.getInsurance().getTheCostOfInsurance() + " , Номер страховки " +
                car.getInsurance().getInsuranceNumber() + ". Максимальная скорость - " +
                car.getMaxSpeed() + " км/ч.");

    }
}