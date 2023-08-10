import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.printf("Equilateral triangle");
        }
        else if(a==b || a==c || b==c){
            System.out.printf("Isosceles triangle");
        }
        else{
            System.out.printf("Scalene triangle");
        }
    }
}