import java.util.Date;

/**
 * Main class demonstrating usage of various data structures.
 * Contains examples of real-world applications.
 */
public class Main {
    /**
     * Entry point of the application.
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("=== Data Structures Demo ===");

        // Twitter example
        TwitterViewTracker tracker = new TwitterViewTracker();
        tracker.displayTweetIfNew(12345, "Hello Twitter world!");
        tracker.displayTweetIfNew(12345, "Hello again!"); // Duplicate

        // Music player example
        MusicQueue queue = new MusicQueue();
        queue.addSong(new Song("Bohemian Rhapsody"));
        queue.addSong(new Song("Stairway to Heaven"));
        queue.playNext();

        // Navigation example
        AppNavigation nav = new AppNavigation();
        nav.navigateTo("Home");
        nav.navigateTo("Profile");
        nav.goBack();


        // Array demo
        ArrayDemo themes = new ArrayDemo();
        System.out.println("Default theme: " + themes.getTheme(0));

        // ArrayList demo
        ArrayListDemo feed = new ArrayListDemo();
        feed.addPost("First post!");

        // LinkedList demo
        LinkedListDemo browser = new LinkedListDemo();
        browser.openTab("https://example.com");

        // HashSet demo
        HashSetDemo users = new HashSetDemo();
        users.registerUser("admin");

        // TreeMap demo
        TreeMapDemo students = new TreeMapDemo();
        students.addStudent(101, "Alice");

        // PriorityQueue demo
        PriorityQueueDemo tasks = new PriorityQueueDemo();
        tasks.addTask(new Task("Urgent bug fix", 1));
    }
}