package Animals;

import java.util.Objects;

public class Flightless extends Birds {
    private String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "Животное{" +
                "класс животного: " + getClass() + " /" +
                "название животного: " + getName() + " /" +
                "возраст животного: " + getAge() + " /" +
                "среда обитания: " + getLivingEnvironment() + " /" +
                "тип передвижения: " + getTypeOfMovement() + "}";
    }

    public void walk() {
        System.out.println("Гулять.");
    }
    @Override
    public void hunt() {
        System.out.println("Охотиться.");
    }
}
