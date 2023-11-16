import java.util.*;
public class rt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            s+=arr[j];
        }
        System.out.println(s);
    }
}