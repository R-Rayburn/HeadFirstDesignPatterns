import IterEnum.IteratorEnumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IterEnumTestDrive {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(args));

        Enumeration<?> iteratorEnumeration = new IteratorEnumeration(arrayList.iterator());

        while (iteratorEnumeration.hasMoreElements())
            System.out.println(iteratorEnumeration.nextElement());
    }
}
