public class wthyk {
    public static void main(String[]args){
        String[] letters = new String[5];
        letters[0] = "'w'";
        letters[1] = "'t'";
        letters[2] = "'y'";
        letters[3] = "'h'";
        letters[4] = "'k'";

        System.out.println("before swap");
        for(int i=0; i<letters.length; i++){
            System.out.print(letters[i] + " ");
        }

        for(int i=0; i<letters.length; i++){
            if(letters[i]=="'t'"){
                letters[i] = "'hello'";
            }
        }

        System.out.println();
        System.out.println("after swap");
        for(int i=0; i<letters.length; i++){
            System.out.print(letters[i] + " ");
        }


    }
}
