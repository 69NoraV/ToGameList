public class List {


    private String listName; // The name of the list

    public List(){} // Empty constructor

    // Constructor with the name
    public List(String n){

        this.listName = n;

    }

    // Utility methods
    public String getName(){return this.listName;}

    public void setName(String n){this.listName = n;}


}