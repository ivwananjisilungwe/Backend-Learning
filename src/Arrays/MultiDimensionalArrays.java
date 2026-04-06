package Arrays;
// MultiDimensional Array = is an array of arrays.
//                          we can store data in table format (rows and columns).
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int numbers[][] = new int[3][4];
        int random = 0;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                numbers[i][j] = (int)(Math.random() * 10);

            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for loop
        for (int[] n : numbers){
            for (int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
