package Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(15, "Gabriela", 1.80f);
        Person person2 = new Person(17, "Gabriel", 1.60f);
        System.out.println(person.getInfo());
        System.out.println(person2.getInfo());
    }
}