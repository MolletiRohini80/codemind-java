import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int intArr[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            intArr[i]=sc.nextInt();
            s+=intArr[i];
        }
        System.out.printf("%d",s);
    }
}