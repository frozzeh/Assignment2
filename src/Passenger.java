import java.util.Objects;

public class Passenger extends User {
    private int age;

    public Passenger(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Passenger: " + getName() + ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Passenger)) return false;
        Passenger other = (Passenger) obj;
        return age == other.age && getName().equals(other.getName());
    }

    @Override public int hashCode() {
        return Objects.hash(getName(), age);
    }

}