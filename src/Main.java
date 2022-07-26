import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter arr1 size: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element " + (i + 1));
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter arr2 size: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter element " + (i + 1));
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = concat(arr1, arr2);

        System.out.println("Connected array:");
        for (int value : arr3) {
            System.out.printf("%-5d", value);
        }
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        return arr3;
    }
}