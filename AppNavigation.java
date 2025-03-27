import java.util.Stack;

/**
 * Manages app navigation history using a Stack (LIFO principle).
 * Used in mobile apps for back button functionality.
 */
public class AppNavigation {
    private final Stack<String> navigationStack = new Stack<>();

    /**
     * Navigates to a new screen and adds it to the history.
     * @param screenName The name/identifier of the screen
     */
    public void navigateTo(String screenName) {
        navigationStack.push(screenName);
        System.out.println("Navigated to: " + screenName);
    }

    /**
     * Goes back to the previous screen.
     * @return The name of the previous screen or null if at root
     */
    public String goBack() {
        if (navigationStack.size() > 1) {
            String current = navigationStack.pop();
            String previous = navigationStack.peek();
            System.out.println("Going back from " + current + " to " + previous);
            return previous;
        }
        System.out.println("Already at root screen");
        return null;
    }
}