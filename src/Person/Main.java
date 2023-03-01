package Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Chris", "Jacob", "Brown");
        person1.setAge(31);

        Person person2 = new Person();
        person2.setName("Jack");
        person2.setMiddleName("Thomas");
        person2.setFamilyName("Evans");
        person2.setAge(31);

        System.out.printf("%s %s %s\n", person1.getName(), person1.getMiddleName(), person1.getFamilyName());
        System.out.printf("Age - %s\n", person1.getAge());
        System.out.printf("Year of birth - %s\n", person1.getYearOfBirth());

        System.out.printf("%s", person2);
    }
}
