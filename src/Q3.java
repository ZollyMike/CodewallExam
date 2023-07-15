import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("User Input : ");
        int input = scan.nextInt();
        for (int i=1; i<=12; i++){
            int ans = input * i;
            System.out.println(input+" x "+i+" = "+ ans);
        }
    }
}
