public class WheelTire extends Part {
    private int size;
    private int wide;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public WheelTire(int id, String producer, String model, int size, int wide) {
        super(id, producer, model);
        this.size = size;
        this.wide = wide;
    }

    @Override
    public void printInfo() {
        System.out.println("id części to: "+this.getId()+" Producent to: "+ this.getProducer()+" Model to: "+
                this.getModel()+" Rozmiar to: "+this.getSize()+" Szerokość to: "+this.getWide());
    }
}
