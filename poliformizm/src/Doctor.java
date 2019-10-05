public class Doctor extends Person {
    private int bonus;

    public Doctor(String name, String surname, int salary, int bonus){
        super(name,surname,salary);
        this.bonus = bonus;
    }

    public void info(){
        super.info();
        System.out.println("Bonus: "+bonus);
        System.out.println("-------------------");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
