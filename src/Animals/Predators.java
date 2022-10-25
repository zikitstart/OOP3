package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int movementSpeeds, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeeds);
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Животное{" +
                "класс животного: " + getClass() + " /" +
                "название животного: " + getName() + " /" +
                "возраст животного: " + getAge() + " /" +
                "среда обитания: " + getLivingEnvironment() + " /" +
                "скорость передвижения: " + getMovementSpeeds() + " /" +
                "тип еды: " + typeOfFood + "}";
    }

    public void hunt() {
        System.out.println("Охотиться.");
    }
    @Override
    public void walk() {
        System.out.println("Гулять.");
    }
}
