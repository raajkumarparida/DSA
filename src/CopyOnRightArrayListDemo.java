import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnRightArrayListDemo {

    public static void main(String[] args) {


        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        List<String> shoppingList = new ArrayList<>();

        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");

        System.out.println(list);

        for (String item : list) {
            System.out.println(item);

            if (item.equals("Eggs")) {
                list.add("Butter");
                System.out.println("Added Butter while reading...");
            }
        }
        System.out.println(list);
    }
}
