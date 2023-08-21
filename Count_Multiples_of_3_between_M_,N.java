import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        for(int i=n;i<m;i++){
          if(i%3==0){
             c=c+1;
          }
        }
        System.out.printf("%d",c);
    }
}