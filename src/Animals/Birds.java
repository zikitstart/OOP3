package Animals;

import java.util.Objects;

public abstract class Birds extends Animals {
    public String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public abstract void hunt();
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
        System.out.println("Двигаться.");
    }
}
