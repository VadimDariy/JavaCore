package TRAINING.ARRAY;

public class SumArray {
    public static int[] sumArray(int[] one, int[] two) {
        int[] sumArray1 = new int[one.length + two.length];

        int k = 0;
        for (int i = 0; i < one.length; i++) {
            sumArray1[k++] = one[i];
        }
        for (int i = 0; i < two.length; i++) {
            sumArray1[k++] = two[i];
        }

        for (int i = 0; i < sumArray1.length; i++) {
            for (int j = 0; j < sumArray1.length - 1 - i; j++) {
                if (sumArray1[j] > sumArray1[j + 1]) {
                    int temp =sumArray1[j];
                    sumArray1[j] = sumArray1[j + 1];
                    sumArray1[j + 1] = temp;
                }
            }
        }
        return sumArray1;
    }
    public static void printCopy(int[] summa){
        System.out.print("[");
        for (int i = 0; i < summa.length; i++) {
            System.out.print(summa[i]);
            if(i != summa.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] one = {12, 5, 8};
        int[] two = {1, 3, 15};
        int[] sumArray2 = sumArray(one, two);
        printCopy(sumArray2);
    }
}
