import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=a[0];
        int j=1;
        while(j<n){
        if(a[j]%m==0){
            j+=1;
        }
        else{
            m=a[j]%m;
        }
        }
        System.out.printf("%d",m);
    }
}