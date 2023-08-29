import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=x+y;
        int b=y+z;
        int c=z+x;
        if(w==a || w==b || w==c){
            System.out.print("YES");
        }
        else if(w==x|| w==y|| w==z){
             System.out.print("YES");
        }
        else{
             System.out.print("NO");
        }
    }
}