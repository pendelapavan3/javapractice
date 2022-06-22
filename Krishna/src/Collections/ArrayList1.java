package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArrayList1 {    
    public static void main(String[] args) {

    ArrayList <Integer > list1 = new ArrayList<>();
    list1.add(50);
    list1.add(5);
    list1.add(01);
    System.out.println(list1.get(0));  
System.out.println(list1);
   list1.set(0, 2);

   list1.remove(1);

    System.out.println(list1);

    System.out.println(list1.size());

    Collections.sort(list1);
   System.out.println(list1);
    //for( int i: list1)
   // {
     //  System.out.println(i);
   // }

    ArrayList list2 = new ArrayList<String>();
    list2.add( "hi");
    list2.add("krishna");
    System.out.println(list2);

    Iterator<String> i = list2.iterator();            
    while(i.hasNext())                             // checks if iterator has the elements
    {
      System.out.println(i.next());
    }

    ArrayList<String> cars = new ArrayList();
    cars.add("vovlo");
    cars.add("benz");
    System.out.println(cars);
cars.clear();                                    // clears all the elements present in the arraylist
System.out.println(cars);
    }
}
