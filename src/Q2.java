import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        int NumArray[] = new int[5];
        for (int i = 0; i < NumArray.length; i++) {
            Scanner scanNum = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            NumArray[i] = scanNum.nextInt();
        }
            int a=NumArray[0];
            int b=NumArray[1];
            int c=NumArray[2];
            int d=NumArray[3];
            int e=NumArray[4];
            double ans= (a+b+c+d+e)/5;
            System.out.println(" Average Number: "+ ans);
    }
}
