public class Part {
    private int id;
    private String producer;
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Part(int id, String producer, String model) {
        this.id = id;
        this.producer = producer;
        this.model = model;
    }

    public void printInfo(){
        System.out.println("id części to: "+this.getId()+" Producent to: "+ this.getProducer()+" Model to: "+
                this.getModel());
    }



}
