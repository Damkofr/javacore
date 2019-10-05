public class Epart extends Part {
    private int size;
    private int wide;
    private boolean ue;

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

    public boolean isUe() {
        return ue;
    }

    public void setUe(boolean ue) {
        this.ue = ue;
    }

    public Epart(int id, String producer, String model, int size, int wide, boolean ue) {
        super(id, producer, model);
        this.size = size;
        this.wide = wide;
        this.ue = ue;
    }

    @Override
    public void printInfo() {
        System.out.println("id części to: "+this.getId()+" Producent to: "+ this.getProducer()+" Model to: "+
                this.getModel()+" Rozmiar to: "+this.getSize()+" Szerokość to: "+this.getWide()+" Unia EU: "+
                this.isUe());
    }
}
