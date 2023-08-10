import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.printf("uppercase alphabet");
        }
        else if(ch>='a' && ch<='z'){
            System.out.printf("lowercase alphabet");
        }
        else{
            System.out.printf("not an alphabet");
        }
    }
}