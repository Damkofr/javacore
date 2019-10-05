public class Nurse extends Person {
    private int overtime;

    public Nurse(String name, String surname, int salary, int overtime) {
        super(name, surname, salary);
        this.overtime = overtime;
    }

    public void info(){
        super.info();
        System.out.println("Overtime: "+overtime);
        System.out.println("---------------------");
    }
}
