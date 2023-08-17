import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.next().charAt(0);
        if(n=='V' || n=='v'){
            System.out.printf("Violet");
        }
        else if(n=='i' || n=='I'){
            System.out.printf("Indigo");
        }
        else if(n=='B'|| n=='b'){
            System.out.printf("Blue");
        }
        else if(n=='g'|| n=='G'){
            System.out.printf("Green");
        }
        else if(n=='y' || n=='Y'){
            System.out.printf("Yellow");
        }
        else if(n=='o' || n=='O'){
            System.out.printf("Orange");
        }
        else if(n=='R' || n=='r'){
            System.out.printf("Red");
        }
        else{
            System.out.printf("-1");
        }
    }
}