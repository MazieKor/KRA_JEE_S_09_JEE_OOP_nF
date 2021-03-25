package pl.coderslab.oop.attributes;

public class Main03 {

    public static void main(String[] args) {
        Person person = new Person();
        person.surname = "Kowalski";
        person.name = "Jan (zmiana imienia)";

        System.out.println("name: " + person.name);
        System.out.println("surname: " + person.surname);
        System.out.println("age: " + person.age);
        System.out.println("gender: " + person.gender);

        int personAdres = System.identityHashCode(person);
        System.out.println("adres: " + personAdres);

    }
}
