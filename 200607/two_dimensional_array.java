import java.util.Scanner;

class two_dimensional_array {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        int [][] Arr;

        Arr = new int[5][8];

        for(int j=0;j<5;j++) {
            for(int k=0;k<8;k++) {
                Arr[j][k] = scanner.nextInt();
            }
        }
        for(int j=0;j<5;j++) {
            for(int k=0;k<8;k++) {
                System.out.print(Arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}