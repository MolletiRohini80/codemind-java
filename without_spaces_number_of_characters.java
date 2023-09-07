import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=s.replaceAll(" ","");
        int c=a.length();
        System.out.print(c);
    }
}