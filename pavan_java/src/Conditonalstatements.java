public class Conditonalstatements {
  public static void main(String[] args) {
      int age = 15;
      int weight = 60;
      if (age>=18){
      System.out.println("Eligeble to vote");
  }else{
      System.out.println("Not eligeble to vote as underage");

  } 
  System.out.println("After if block"); 

int n=20;
if (n % 2 == 0)
System.out.println("Its an even number");
else
System.out.println("its an odd number");
//other way
String output = (n%2==0)?"even":"odd";
System.out.println(output);

// nested if statements
if (age>=18){
    System.out.println("Eligeble as per age");
    if (weight >=60){
        System.out.println("Eligeble to donate blood");
    }
    else{
        System.out.println("Not eligeble as per weight criteria");
    }
}
else{
    System.out.println("Not eligeble as per under age");

}
System.out.println("after if block");
}

}
