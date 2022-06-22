//package Practices;
import java.util.ArrayList;   
import java.util.*;
import java.util.Iterator;

import javax.sound.sampled.SourceDataLine;
public class ArrayList1
{
public static void main(String args[]){  
ArrayList list= new ArrayList<>();                                //Creating arraylist using raw type
list.add("This is one");                                         //Adding object in arraylist  
list.add("of the array list");                                  //we can add any datatype into the arraylist since the declared arraylist as a raw type.
list.add(123);
System.out.println(list);

Iterator itr=list.iterator();                                  //Traversing list through Iterator
while(itr.hasNext()){  
System.out.println(itr.next());  
}  

ArrayList<Integer> arrlist1 = new ArrayList<Integer>();         // Using Generic syntax 
arrlist1.add(25);                                               // since we used the Arraylist type as an integer, we can store only integer elements.
System.out.println(arrlist1); 

ArrayList<String> arrlist2 = new ArrayList<String>();          
arrlist2.add("cricket");
arrlist2.add("baseball");
arrlist2.add("basketball");
arrlist2.add("football");
System.out.println(arrlist2);
for(String sport:arrlist2)                                     //iterating arraylist using For-each loop
System.out.println(sport);

System.out.println("returning element is:" +arrlist2.get(1));   //iterating arraylist using Get and Set method
arrlist2.set(1,"tennis");

Collections.sort(arrlist2);                                      // sorting the arraylist
for(String sport:arrlist2)                                     
System.out.println(sport);
}
}