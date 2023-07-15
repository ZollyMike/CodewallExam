import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the Length of Array : ");
        int arr = scan.nextInt();

        int NumArray[] = new int[arr];
        for (int i = 0; i < NumArray.length; i++) {
            Scanner scanNum = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            NumArray[i] = scanNum.nextInt();
        }
        System.out.print(" Result : ");
        for (int i = 0; i < NumArray.length; i++) {
            if (NumArray[i]% 3 != 0){
                System.out.print(NumArray[i]+ " ");
            }
        }
    }
}
