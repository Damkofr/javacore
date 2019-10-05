public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.addPerson(new Doctor("Dawid","Wenderlich",1000,400));
        hospital.addPerson(new Nurse("Anita","Daba",500,30));
        hospital.addPerson(new Nurse("Maria","Sekna",2000,50));
        hospital.addPerson(new Nurse("gdgre","Sekna",2000,50));

        hospital.showPersons();

    }
}
