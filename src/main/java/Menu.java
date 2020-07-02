import java.util.List;
import java.util.ArrayList;
import  java.lang.*;

public class Menu {
    private List<MenuItem> items;
    private  List<Writer> writers;


    public Menu() {
        items = new ArrayList<MenuItem>();
        writers = new ArrayList<Writer>();


    }

    public void addItem(MenuItem menuItem){
        items.add(menuItem);
    }

    public void show(){
    for(MenuItem item : items){
        System.out.println(item.getTitle());
    }
        System.out.println("Exit");
    }
    public void addWriter(Writer writer){
        writers.add(writer);
    }


    public MenuItem GetMenuItemByTitle(String title){
        MenuItem searchedItem = null;
        for(MenuItem item : items){
            if(item.getTitle().equals(title)){searchedItem = item;}

        }
        return searchedItem;


    }


}
