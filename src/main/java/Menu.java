import java.util.List;

public class Menu {
    private List<MenuItem> items;
    private  List<Writer> writers;

    public void addItem(MenuItem menuItem){
        items.add(menuItem);
    }

    public void show(){
    for(MenuItem item : items){
        System.out.println(item.getTitle() + "\n");
    }
    }
    public void addWriter(Writer writer){
        writers.add(writer);
    }



}
