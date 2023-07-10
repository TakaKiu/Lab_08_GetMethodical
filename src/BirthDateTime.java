import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter the year of your birth (1950-2015): ", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter the month of your birth (1-12): ", 1, 12);
        int birthDay = getValidDay(in, birthMonth);
        int birthHour = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24): ", 1, 24);
        int birthMinute = SafeInput.getRangedInt(in, "Enter the minute of your birth (1-59): ", 1, 59);

        System.out.println("Your birth date and time: " + birthMonth + "/" + birthDay + "/" + birthYear +
                " " + birthHour + ":" + birthMinute);
    }

    private static int getValidDay(Scanner in, int month) {
        int birthDay;

        switch (month) {
            case 2: // February
                birthDay = SafeInput.getRangedInt(in, "Enter the day of your birth (1-29): ", 1, 29);
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                birthDay = SafeInput.getRangedInt(in, "Enter the day of your birth (1-30): ", 1, 30);
                break;
            default: // January, March, May, July, August, October, December
                birthDay = SafeInput.getRangedInt(in, "Enter the day of your birth (1-31): ", 1, 31);
                break;
        }

        return birthDay;
    }
}