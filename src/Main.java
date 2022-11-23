import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main obj = new Main();
        obj.task1();
        obj.task2();
        obj.task3();
    }

    public int[] task1() {
        System.out.println("\nTask 01");
        int s = 100;
        int[] arr = new int[s];
        System.out.print("[");
        for (int i=0; i<s; i++){
            arr[i] = i;
            System.out.print(i + "; ");
        }
        System.out.println("]");
        return arr;
    };


    public int[] task2() {
        System.out.println("\nTask 02");
        int s = 100;
        int k = 2;
        int[] arr = new int[s];
        System.out.print("[");
        for (int i=0; i<s; i++){
            arr[i] = k;
            System.out.print(k + "; ");
            k+=2;
        }
        System.out.print("]");
        return arr;
    };


    public void task3() {
        System.out.println("\nTask 03 \nfor exit input number more than 1000.");
        int k;
        boolean repite = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please input integer number:");
            k = sc.nextInt();

            if (k > 1000) {
                repite = false;
            }
        } while (repite);
        System.out.println("Thank you. Bay!");

    };
}