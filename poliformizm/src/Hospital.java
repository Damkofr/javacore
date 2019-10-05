public class Hospital {

    final private int max = 3;
    Person[] persons = new Person[max];
    private int count = 0;

    public void addPerson(Person person){

        if(count >= max)
        {
            System.out.println("Nie możesz dodać więcej osób");
        }
        else
        {
            persons[count] = person;
            count++;
        }
    }


    public void showPersons(){
        for(Person x : persons){
            x.info();
        }
    }
}
