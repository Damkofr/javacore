public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Asus",36));
        dataStore.add(new Computer("Asus",36));
        dataStore.add(new Computer("HP",3565));
        dataStore.add(new Computer("Lenovo",54343));
        dataStore.add(new Computer("Intel",3435));

        Computer find = new Computer("Asus",36);
        int computersFind = dataStore.checkAvailability(find);
        System.out.println("Liczba komptuerów: "+find+": "+computersFind);


        System.out.println("Wszystkie dostępne komputery: ");
        for(Computer c:dataStore.getComputers()){
            System.out.println(c);
        }


    }
}
