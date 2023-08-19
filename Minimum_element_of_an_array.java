import java.util.Scanner;
public class u{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int min=32768;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.printf("%d",min);
    }
}