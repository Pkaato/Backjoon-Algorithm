import java.util.Scanner;

/**
 * A + B
 * 1 + 2 の結果を出力する
 * 
 */

class m1000 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a + b);

        // int[] arrInt = { 1, 2, 3, 4, 5 };
        // // System.out.println(arrInt[0] + arrInt[1]);
        // int result;

        // for (int i = 0; i < arrInt.length; i++) {
        // for (int j = 0; j < arrInt.length; ++j) {
        // if (arrInt[i] + arrInt[j] == 3) {
        // result = arrInt[i] + arrInt[j];
        // System.out.println(result);
        // return;
        // }
        // }
        // }
        // int A = 1;
        // int B = 2;
        // System.out.println(A + B);
    }
}