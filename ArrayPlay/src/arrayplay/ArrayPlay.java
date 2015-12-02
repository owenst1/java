/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayplay;

/**
 *
 * @author 2763435
 */
public class ArrayPlay {

    public static int N = 1;
    public static int ROWS = 10;
    public static int COLUMNS = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1[0] = 7;
        arr1[1] = 6;
        arr1[2] = 11;
        arr1[3] = 17;
        arr1[4] = 3;

        /*
         arr1[0] = 1;
         arr1[1] = 2;
         arr1[2] =3;
         arr1[3] = 4;
         arr1[4] = 5;
         */
        bubbleSort(arr1);
        printArr(arr1);

        int[] arr2 = new int[10];
        arr2[0] = 7;
        arr2[1] = 6;
        arr2[2] = 11;
        arr2[3] = 17;
        arr2[4] = 5;
        arr2[5] = 12;
        arr2[6] = 18;
        arr2[7] = 24;
        arr2[8] = 31;
        arr2[9] = 1;

        selectSort(arr2);
        printArr(arr2);

        int[] arr3 = new int[10];
        arr3[0] = 7;
        arr3[1] = 6;
        arr3[2] = 11;
        arr3[3] = 17;
        arr3[4] = 5;
        arr3[5] = 12;
        arr3[6] = 18;
        arr3[7] = 24;
        arr3[8] = 31;
        arr3[9] = 1;

        descendingSort(arr3);
        printArr(arr3);

        roach();
    }

    private static void roach() {
        int[][] roach = new int[10][5];
        roach[0][0] = 10;
        roach[0][0] = 10;
        roach[0][1] = 100;
        roach[0][2] = 500;
        roach[0][3] = 1000;
        roach[0][4] = 5000;
        for(int row =1; row< 10; row++){
            for (int column = 0; column < 5;column ++){
                roach[row][column]=roach[row-1][column]*2;
            }
        }
        System.out.print("pop 1\t pop 2\t pop 3\t pop 4\t pop 5");
        for(int i =0; i<10;i++){
            System.out.println("");
            for(int j =0;j<5;j++){
                System.out.print(roach[i][j]+"\t");
            }
        }
    
     {
            
        }
    }

    private static void printArr(int[] arr) {
        for (int o = 0; o < arr.length; o++) {
            System.out.println("arr" + N + " [" + o + "] " + arr[o]);

        }
        N++;
    }

    private static void bubbleSort(int[] arr) {
        boolean wasSwapped = true;
        int i = 0;
        while (wasSwapped) {
            wasSwapped = false;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    wasSwapped = true;
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }

            i++;
        }
        int out = i - 1;
        System.out.println("Complete sorting after " + out + " iterations.");
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfSmallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            int smallest = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = smallest;
        }
    }

    private static void descendingSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfSmallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            int smallest = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = smallest;
        }
    }

}
