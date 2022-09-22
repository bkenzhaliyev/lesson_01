package сom.gb.task_01;

public class Main {
    public static void main(String[] args) {
        Person[] persons = { new Person.Builder()
                .withFirstName("Nikolay")
                .withLastName("Ivanov")
                .withAge(25)
                .withPhone("+7-901-900-34-55")
                .withCountry("Kazakhstan")
                .withGender("M")
                .build() };

        for (Person person : persons){
            System.out.println(person);
        }

    }
}
