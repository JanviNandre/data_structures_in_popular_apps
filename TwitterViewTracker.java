import java.util.HashSet;
import java.util.Set;

/**
 * Tracks viewed tweets using a HashSet to prevent duplicates.
 * Demonstrates O(1) time complexity for contains/add operations.
 */
public class TwitterViewTracker {
    private final Set<Long> seenTweets = new HashSet<>();

    /**
     * Displays a tweet if it hasn't been seen before.
     * @param tweetId The unique identifier of the tweet
     * @param tweet The content of the tweet to display
     */
    public void displayTweetIfNew(long tweetId, String tweet) {
        if (!seenTweets.contains(tweetId)) {
            System.out.println("Showing new tweet: " + tweet);
            seenTweets.add(tweetId);
        } else {
            System.out.println("Tweet already seen");
        }
    }

    /**
     * Checks if a tweet has been viewed.
     * @param tweetId The tweet ID to check
     * @return true if the tweet has been seen, false otherwise
     */
    public boolean hasSeenTweet(long tweetId) {
        return seenTweets.contains(tweetId);
    }
}