import javax.swing.*;

/* This class will handle the creation of a new list.
Using tables I'll be able to show list with a GUI and, using buttons, the user will modify the table as he please.
This is my first time using a graphic library on java I hope to come up on top.
*/

public class List {


    private String listName; // The name of the list

    private String[] tableColomn = {"gameName", "gameGenre", "hoursPlayed", "compleated"};
    private String[][] tableData = {{"Name1", "Genre1", "3", "No"}, {"Name2", "Genre2", "15", "Yes"}};

    public List(){} // Empty constructor

    // Constructor with the name
    public List(String n){

        this.listName = n;



    }

    // Utility methods
    public String getName(){return this.listName;}

    public void setName(String n){this.listName = n;}


    public void createTable(){

    }

    public void addDataToTable(){

    }
}