public class Contact {
    public static void main(String[] args) {
        Person human = new Person("Ivan", "Ivanov", "89234567856");
        human.print();
        human.setName("Pavel");
        String hisName = human.getName();
        System.out.print(hisName);

    }

    static class Person {
        private String name;
        private String surname;
        private String phoneNumber;


        public Person(String name, String surname, String phoneNumber) {
            this.name = name;
            this.surname = surname;
            this.phoneNumber = phoneNumber;
        }

        public void print () {
            System.out.printf("name: %s, surname: %s, phone number: %s%n", name, surname, phoneNumber);
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
}
