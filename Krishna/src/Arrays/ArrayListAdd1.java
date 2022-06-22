package Practices;

import java.util.ArrayList;
public class ArrayListAdd1{
public static void main(String[] args) {
ArrayList list = new ArrayList<>();
list.add("element1");	                                    // [element1]
//list.add(Boolean.TRUE);	                                    // [element1, true]
//list.add(Boolean.FALSE);
list.add("last element");	                               // [element1, true, last element]
list.add(0, "hi");                                         // [hi is inserted in the first position of the list]
list.add(1, "is inserted in the 1st list position");
System.out.println(list);	                                
}
}
