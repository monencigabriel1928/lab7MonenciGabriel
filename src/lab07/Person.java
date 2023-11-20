package lab07;

public class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Adi", 25, "123 Bumbac St");
        System.out.println("Initial Information:");
        person1.displayInfo();
        person1.age = 26;
        person1.address = "456 Mihai Eminescu";
        System.out.println("\nModified Information:");
        person1.displayInfo();
    }
}

