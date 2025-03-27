/**
 * Represents a song with title and other metadata.
 * Used in music player applications.
 */
public class Song {
    private final String title;

    /**
     * Constructs a new Song with the given title.
     * @param title The title of the song
     */
    public Song(String title) {
        this.title = title;
    }

    /**
     * Gets the song title.
     * @return The title of the song
     */
    public String getTitle() {
        return title;
    }
}