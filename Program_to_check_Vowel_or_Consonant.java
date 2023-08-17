import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
        if(x=='A' ||x=='E'||x=='I'|| x=='U'|| x=='O' || x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u'){
            System.out.printf("Vowel");
        }
        else{
            System.out.printf("Consonant");
        }
    }
}