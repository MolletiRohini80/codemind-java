import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int p=(a+b+c+d+e)/5;
        if(p>=90){
            System.out.printf("Grade A");
        }
        else if(p>=80){
            System.out.printf("Grade B");
        }
        else if(p>=70){
            System.out.printf("Grade C");
        }
        else if(p>=60){
            System.out.printf("Grade D");
        }
        else if(p>=40){
            System.out.printf("Grade E");
        }
        else{
            System.out.printf("Grade F");
        }
    }
}