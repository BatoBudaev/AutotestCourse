package Person;

import java.time.Year;
import java.util.Objects;

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
        checkStringValue(name);
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        checkStringValue(name);
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        checkStringValue(name);
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkIntValue(age);
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

    private void checkStringValue(String value) {
        if (Objects.isNull(value) || value.length() == 0) {
            throw new IllegalArgumentException("Please enter a valid value");
        }
    }

    private void checkIntValue(int value) {
        if (value < 0 || value > 120) {
            throw new IllegalArgumentException("Please enter a valid value");
        }
    }

}
