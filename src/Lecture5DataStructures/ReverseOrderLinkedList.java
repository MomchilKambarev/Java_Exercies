package Lecture5DataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseOrderLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<Integer>();
        number.add(11);
        number.add(22);
        number.add(33);
        number.add(44);
        number.add(55);
        System.out.println(number);

        Iterator iter = number.descendingIterator();

        System.out.println("Elements in reverse order");
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
