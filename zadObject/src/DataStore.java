public class DataStore {
    static final int MAX_COM=100;
    Computer[] computers = new Computer[MAX_COM];
    private int computersNumber;

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getComputersNumber() {
        return computersNumber;
    }

    public void setComputersNumber(int computersNumber) {
        this.computersNumber = computersNumber;
    }

    public Computer[] getComputers(){
        Computer[] comps = new Computer[computersNumber];
        for(int i=0; i<computersNumber; i++)
        {
            comps[i]=computers[i];
        }
        return comps;
    }

    public void add(Computer comp) {
        if(computersNumber<MAX_COM&&comp!=null)
        {
            computers[computersNumber]=comp;
            computersNumber++;
        }


    }

    public int checkAvailability(Computer find){
        if(find==null)
            return 0;

        int count=0;
        for(int i=0;i<computersNumber;i++)
        {
            if(find.equals(computers[i])){
                count++;
            }
        }
        return count;

    }
}
