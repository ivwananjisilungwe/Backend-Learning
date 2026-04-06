package Arrays;
//? Arrays = a collection of variables of the same type.
//?          arrays are used to store multiple values in a single variable,
//?          instead of declaring separate variables for each value.
public class ArraysIntro {
    public static void main(String[] args) {
        //? 1.declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Alternative way to declare and initialize an array
        int numbersArray[] = new int[5];
        numbersArray[0] = 5;
        numbersArray[1] = 15;
        numbersArray[2] = 25;
        numbersArray[3] = 35;
        numbersArray[4] = 45;
        System.out.println(numbersArray[2]);

        //? 2.accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        //? 3.modifying array elements
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        //? 4.iterating through an array

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
