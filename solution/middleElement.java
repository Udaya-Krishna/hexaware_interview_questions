import java.util.*;
public class middleElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                al.add(arr[i]);
            }
        }
        int len=al.size();
        int middle;
        if(len%2==0){
            middle=(len/2)-1;
        }
        else middle=len/2;
        System.out.println("Middle element:"+al.get(middle));
    }
}
