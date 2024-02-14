import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Fish");
        myList.add("Cat");
        myList.add("Dog");

        //puts items from myList into newList
        ArrayList<String> newList = new ArrayList<>(myList);

        //prints out lists, myList is preserved and newList is updated
        removeItemFromArrayList(newList);
        System.out.println(myList);
        System.out.println(newList);
    }

    public static ArrayList<String> removeItemFromArrayList(ArrayList<String> a){
        a.removeLast();
        return a;
    }
}