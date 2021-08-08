package person;

public class PersonBuilder {
    private Person person = new Person();

    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surName) {
        person.surName = surName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Задан недопустимый возраст");
        } else {
            person.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        person.address = address;
        return this;
    }

    public Person build() {
        if (person.getName() == null ||
                person.getSurName() == null ||
                person.getAddress() == null) {
            throw new IllegalStateException("Заполнены не все данные о человеке");
        } else return person;
    }
}