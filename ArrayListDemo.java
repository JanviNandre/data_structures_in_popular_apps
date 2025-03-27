import java.util.ArrayList;

/**
 * Demonstrates ArrayList - resizable array implementation
 */
public class ArrayListDemo {
    private ArrayList<String> feedPosts = new ArrayList<>();

    /**
     * Adds new post to feed
     * @param post content to add
     */
    public void addPost(String post) {
        feedPosts.add(post);
        System.out.println("Added post: " + post);
    }

    /**
     * Removes post at index
     * @param index position to remove
     * @return removed post content
     */
    public String removePost(int index) {
        return feedPosts.remove(index);
    }

    /**
     * @return current feed size
     */
    public int getFeedSize() {
        return feedPosts.size();
    }
}