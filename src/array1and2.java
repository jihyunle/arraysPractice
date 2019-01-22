public class array1and2 {
    public static void main(String[]args){
        int[]ar1 = new int[]{1, 7, 6, 5, 9};
        int[]ar2 = new int[]{2, 7, 6, 3, 4};
        for(int i=0; i<ar1.length; i++){
            if(ar1[i]==ar2[i]){
                System.out.println("(" + ar1[i] + "," + ar2[i] + ")");
            }
        }
    }
}
