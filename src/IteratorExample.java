import java.util.ArrayList;
import java.util.Iterator;

/**
 * Program to demonstrate an Iterator
 */
public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        IteratorExample ie = new IteratorExample();
        ie.print(arrayList);
    }

    public void print(ArrayList<Integer> array){
        Iterator iterator = array.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
    }

}