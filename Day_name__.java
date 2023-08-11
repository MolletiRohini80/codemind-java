import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1){
            System.out.printf("Monday");
        }
        else if(a==2){
            System.out.printf("Tuesday");
        }
        else if(a==3){
            System.out.printf("Wednesday");
        }
        else if(a==4){
            System.out.printf("Thuresday");
        }
        else if(a==5){
            System.out.printf("Friday");
        }
        else if(a==6){
            System.out.printf("Saturday");
        }
        else if(a==7){
            System.out.printf("Sunday");
        }
        else{
            System.out.printf("Invalid input");
        }
    }
}