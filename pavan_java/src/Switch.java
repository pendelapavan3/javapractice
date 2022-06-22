public class Switch {
    public static void main(String[]args) {
        int i=20;

        switch (i+30) {
            case 20:
                 System.out.println("value is 20");
                break;
            case 40:
                System.out.println("value is 40");
                break;
            case 50:
                System.out.println("value is 50");
                break;
            default:
                System.out.println("nothing matched");
                break;
        }
        
    }
} 

