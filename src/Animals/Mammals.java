package Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    public String livingEnvironment;
    public int movementSpeeds;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeeds) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setMovementSpeeds(movementSpeeds);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public int getMovementSpeeds() {
        return movementSpeeds;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }
    public void setMovementSpeeds(int movementSpeeds) {
        if (movementSpeeds < 0) {
            this.movementSpeeds = 0;
        } else {
            this.movementSpeeds = movementSpeeds;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return movementSpeeds == mammals.movementSpeeds && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeeds);
    }


    public abstract void walk();
    @Override
    public void eat() {
        System.out.println("Есть еду.");
    }
    @Override
    public void sleep() {
        System.out.println("Спать.");
    }
    @Override
    public void go() {
        System.out.println("Идти.");
    }
}
