import java.util.LinkedList;

/**
 * Demonstrates LinkedList operations - optimal for frequent inserts/deletes
 */
public class LinkedListDemo {
    private LinkedList<String> browserTabs = new LinkedList<>();

    /**
     * Opens new tab
     * @param url webpage to open
     */
    public void openTab(String url) {
        browserTabs.addLast(url);
        System.out.println("Opened tab: " + url);
    }

    /**
     * Closes most recent tab
     * @return URL that was closed
     */
    public String closeTab() {
        return browserTabs.removeLast();
    }

    /**
     * @return number of open tabs
     */
    public int getTabCount() {
        return browserTabs.size();
    }
}