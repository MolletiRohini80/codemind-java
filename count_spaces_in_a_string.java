import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a==' '){
                c+=1;
            }
        }
        System.out.printf("%d",c);
    }
}