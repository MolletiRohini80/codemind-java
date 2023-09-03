import java.util.Scanner;
public class vo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            c=(n*(n+1))/2;
        }
        System.out.printf("%d",c);
    }
}