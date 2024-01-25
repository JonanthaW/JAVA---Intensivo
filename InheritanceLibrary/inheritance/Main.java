package InheritanceLibrary.inheritance;  // Lowercase package name

import InheritanceLibrary.inheritance.Type.Romance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Debugging and adding some books to the database just for test purposes");
        Romance romance = new Romance("Peter pan", 500, 50.0f);

        System.out.println("Getting books from database");
        System.out.println(String.format("%s %s", romance.getName(), romance.getTags()));
    }
}
