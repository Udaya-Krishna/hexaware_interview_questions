import java.util.*;
public class wheatstoneBridge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 resistor values:");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int r3=sc.nextInt();
        int r4=(r3*r2)/r1;
        System.out.println("R4:"+r4);
    }
}
