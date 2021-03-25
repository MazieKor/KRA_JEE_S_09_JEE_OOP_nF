package pl.coderslab.oop.methods;

public class Main01 {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Tomek");
        person.setAge(13);
        person.setSurname("Kowalski");
        person.setGender('m');

        System.out.println("imię osoby: " + person.name);

        person.setName("Irek");

        System.out.println("imię osoby 2: " + person.name);

        String getName = person.getFullName();
        System.out.println("getter zwraca: " + getName);

        person.incrAge();



    }


}
