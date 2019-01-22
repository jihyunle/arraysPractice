import java.util.Scanner;

public class num1to10UserInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Please enter a number: ");
            numbers[i] = keyboard.nextInt();
            sum += numbers[i];

        }
        System.out.println("The sum of the numbers you entered is " + sum);

        int avg = 0;
        avg = sum / numbers.length;
        System.out.println("The average of the numbers you entered is " + avg);

    }
}
