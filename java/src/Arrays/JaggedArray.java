package Arrays;
//? JaggedArray = an array of different size of arrays or rows

public class JaggedArray {
    public static void main(String[] args) {

        int[][] numbers = new int[3][];


        for (int i = 0; i < numbers.length; i++){

            for (int j = 0; j < numbers[i].length; j++){
                numbers[i][j] = (int)(Math.random() * 10);
            }


        for (int[] n : numbers){
            for (int m : n){
                System.out.print( m + " ");
            }
            System.out.println();
        }

    }
}
}