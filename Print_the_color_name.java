import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='V'){
            System.out.printf("Violet");
        }
        else if(ch=='i'){
            System.out.printf("indigo");
        }
        else if(ch=='B'){
            System.out.printf("Blue");
        }
        else if(ch=='G'){
            System.out.printf("Green");
        }
        else if(ch=='Y'){
            System.out.printf("Yellow");
        }
        else if(ch=='O'){
            System.out.printf("Orange");
        }
        else if(ch=='R'){
            System.out.printf("Red");
        }
        else{
            System.out.printf("-1");
        }
    }
}