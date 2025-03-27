/**
 * Represents a message with content and timestamp metadata.
 * Used in messaging applications like WhatsApp.
 */
public class Message {
    private final String content;
    private final long timestamp;

    /**
     * Constructs a new Message with the given content and timestamp.
     * @param content The text content of the message
     * @param timestamp The epoch time when message was created
     */
    public Message(String content, long timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    /**
     * Gets the message content.
     * @return The message text
     */
    public String getContent() {
        return content;
    }

    /**
     * Gets the message timestamp.
     * @return The creation time in milliseconds since epoch
     */
    public long getTimestamp() {
        return timestamp;
    }
}