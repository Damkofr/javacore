public class Main {
    public static void main(String[] args) {

        Part part1 = new Part(55,"Honda","zderzak");
        part1.printInfo();
        WheelTire wheelTire1 = new WheelTire(2,"Yamaha","koło",18,12);
        wheelTire1.printInfo();
        Epart epart1 = new Epart(21,"Aprilla","wydech",23,2,true);
        epart1.printInfo();

    }
}
