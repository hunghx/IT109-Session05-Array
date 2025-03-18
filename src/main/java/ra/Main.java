package ra;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Mảng 1 chiều
        // c1 : new
        int[] arrayInt = new int[10];
        System.out.println(Arrays.toString(arrayInt));
        // c2: literal
        int[] arrayLiteral = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arrayLiteral));
        // c3 :
        Integer[] arrayInit = new Integer[]{1,2,3,4,5,6,7};
        System.out.println("Độ dài mảng : "+arrayInit.length);

        // truy xuất phần tử
        int element = arrayInit[3];
        System.out.println(element);

        arrayInit[6] = 100;

        System.out.println(Arrays.toString(arrayInit));
        Integer[] arrClone = arrayInit.clone();
        System.out.println(System.identityHashCode(arrayInit));
        System.out.println(System.identityHashCode(arrClone));

        Arrays.sort(arrayInit,Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrayInit));

        // duyệt mảng
        for (int i = 0; i < arrayInit.length ; i++) {
            // thực hiện tác thao ta với phần tử
        }

        for (int ele : arrayInit){
            // thao tac với giá trị
        }

        // mảng 2 chiếu
//        int [][] array2D = new int[10][5];
        int [][] array2D = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(array2D));

        array2D[1][1] = 100;
        System.out.println(Arrays.deepToString(array2D));

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                // thao tac voi lan luot tung phan tu
                array2D[i][j] = 0;
            }
        }

    }
}