public class num10to1 {
    public static void main(String[]args){
        int[] num = new int[10];
        for(int i=0; i<num.length; i++){
            num[i] = i+1;

        }
        for(int j=num.length-1; j>=0; j--){
            System.out.println(num[j]);
        }
    }
}
