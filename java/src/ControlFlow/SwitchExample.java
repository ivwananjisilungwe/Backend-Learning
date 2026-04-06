package ControlFlow;
// ! switch = a control flow statement that allows a variable to be tested
// !          for equality against a list of values (cases).
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        // Determine the name of the day based on its number
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);
    }

}
