package secondslips1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class slip2a
{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Set<String> friendNames = new HashSet<String>();

        // Read the number of friends
        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();

        // Read the names of friends and add them to HashSet
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the name of friend " + i + ": ");
            String name = scanner.next();
            friendNames.add(name);
        }

        // Display the friend names in ascending order using TreeSet
        Set<String> sortedFriendNames = new TreeSet<String>(friendNames);
        System.out.println("\nFriend Names in Ascending Order:");
        for (String name : sortedFriendNames) {
            System.out.println(name);
        }
    }
}

