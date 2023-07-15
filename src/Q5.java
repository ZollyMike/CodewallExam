import java.lang.reflect.Array;

public class Q5 {
    public static void main(String[] args) {
        int Arr[][]={{1,2,3,4,5},{5,4,3,2,1},{7,8,9,1,5,7,7}};
        for (int[] ints : Arr) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print((anInt-1)+" ");
            }
        }
    }
}
