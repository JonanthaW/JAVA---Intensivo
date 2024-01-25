package Person;

public class Person {
    private int age;
    private String name;
    private float height;

    public Person(int age, String name, float height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public String getInfo() {
        return String.format("%d %s %.2f", age, name, height);
    }
}
