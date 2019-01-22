public class num1to10 {
    public static void main(String[] args){
        int arraySize = 10;
        int sum = 0;
        int[] numbers = new int[arraySize];
        for(int index = 0; index < arraySize; index++){
            // assign values 1 through 10 to the array
            numbers[index] = index + 1;

            // sum up numbers 1 through 10
            sum += numbers[index];
        }
        System.out.println("The sum of numbers 1 through 10 is " + sum);
    }
}
