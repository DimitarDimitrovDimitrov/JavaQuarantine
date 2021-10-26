package switchEx;

public class Switch {

    public static void main(String[] args){

        int day = 3;
        String dayType;
        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
            case 5:
                dayString = "Friday";
            case 6:
                dayString = "Saturday";
            case 7:
                dayString = "Sunday";

            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
