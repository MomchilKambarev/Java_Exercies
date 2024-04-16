package DataStructures;

import java.util.LinkedList;

public class ReverseLinkedListElements {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.addFirst("BMW");
        cars.addLast("Ford");
        cars.add(2, "Mazda");

        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            String lastElem = cars.pollLast();
            cars.add(i, lastElem);
        }
        System.out.println(cars);
    }
}

