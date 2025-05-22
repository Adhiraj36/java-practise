import java.util.*;
public class Test {
    public static void main(String[] arg) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.1");  
        int no1=sc.nextInt();
        System.out.println("Enter no.2");  
        int no2=sc.nextInt();
        System.out.println("Enter no.3");  
        int no3=sc.nextInt();
        int no_max= Math.max(no1, Math.max(no2,no3));
        int no_min= Math.min(no1, Math.min(no2,no3));
        System.out.println(no_max);
        System.out.println(no_min);
    double avg= (no1+no2+no3)/3;
    System.out.println(avg);
    }
}
