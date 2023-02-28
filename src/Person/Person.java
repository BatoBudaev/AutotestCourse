package Person;

import java.time.Year;

class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person() {
    }

    public Person(String name, String middleName, String familyName) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age='" + age + '\'';
    }

    public int getYearOfBirth() {
        return Year.now().getValue() - age;
    }
}
