import java.util.AbstractList;
import java.util.List;

public class MyStringList extends AbstractList<String> {
    private final String[] myList;

    public MyStringList(String[] strings) {
        myList = strings;
    }

    public String get(int index) {
        return myList[index];
    }

    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }

    public static void main(String[] args) {
        String[] ducks = {"Daffy", "Donald", "Howard"};
        MyStringList duckList = new MyStringList(ducks);
        List<String> duckSubList = duckList.subList(1,3);
        for (Object o : duckSubList) System.out.println(o);
    }
}
