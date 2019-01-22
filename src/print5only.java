public class print5only {
    public static void main(String[] args){
        int[] num = {2, 5, 9, 0, 2, 1, 8, 5, 4};
        for(int i=0; i<num.length; i++){
            if(num[i]==5){
                System.out.println("index where 5 was found: " + i);
            }
        }

    }
}
