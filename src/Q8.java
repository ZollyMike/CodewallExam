import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        int NumArray[] = new int[3];
        for (int i = 0; i < NumArray.length; i++) {
            Scanner scanNum = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            NumArray[i] = scanNum.nextInt();
        }
        int a=NumArray[0];
        int b=NumArray[1];
        int c=NumArray[2];
        if(a>b && a>c){
            System.out.println("Largest :"+ a);
        }
        else if(b>a && b>c){
            System.out.println("Largest :"+ b);
        }
        else if(c>a && c>b){
            System.out.println("Largest :"+ c);
        }
        else{
            System.out.println("Invalid.");
        }
    }
}
