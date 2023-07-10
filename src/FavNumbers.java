import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double");
        int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer");

        System.out.println("Your favorite double: " + favoriteDouble);
        System.out.println("Your favorite integer: " + favoriteInt);
    }
}