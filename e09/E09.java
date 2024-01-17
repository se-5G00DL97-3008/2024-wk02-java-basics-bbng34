import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 1;
        double finalScore = 0;
        while (true) {
            
            System.out.println("Give a test score (-1 to exit): ");
            double score = scanner.nextDouble();
            if (score == -1) {
                break;
            } else {
            finalScore += score;
            double avg = finalScore/count;
            System.out.println("Average: "+avg);
            count++;
            }

        

        }
        scanner.close();
    }
}