import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int num = scanner.nextInt();
        scanner.close();

        for (int i=0;i<11;i++) {
            System.err.println(i + " x " + num +" = " + (i*num));
        }


    }
}