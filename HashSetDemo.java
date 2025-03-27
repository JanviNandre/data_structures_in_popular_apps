import java.util.HashSet;

/**
 * Demonstrates HashSet for storing unique values
 */
public class HashSetDemo {
    private HashSet<String> usernames = new HashSet<>();

    /**
     * Registers new username
     * @param username name to register
     * @return true if added, false if duplicate
     */
    public boolean registerUser(String username) {
        if (usernames.contains(username)) {
            System.out.println("Username taken: " + username);
            return false;
        }
        usernames.add(username);
        return true;
    }

    /**
     * Checks username availability
     * @param username name to check
     * @return true if available
     */
    public boolean isUsernameAvailable(String username) {
        return !usernames.contains(username);
    }
}