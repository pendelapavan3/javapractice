package Collections;
import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>  cars = new LinkedList<>();
        cars.add("bmw");
        cars.add("benz");
        cars.add("corvette");
        System.out.println(cars);

        cars.addFirst("alfa");
        System.out.println(cars);

        cars.addLast("lambo");
        System.out.println(cars);

        cars.remove();
        System.out.println(cars);
        cars.removeFirst();                //.remove() will also removes the first element in the list, where as removeLast() will removes last element form the list
        System.out.println(cars);
        System.out.println(cars.getFirst());  // gets the first element of the list. getLast() gives the last element
        System.out.println(cars);
    }
}
