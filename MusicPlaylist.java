import java.util.Collections;
import java.util.Date;
import java.util.TreeMap;

/**
 * Manages a music playlist sorted by release date using TreeMap.
 * Demonstrates automatic sorting by key (date).
 */
public class MusicPlaylist {
    private final TreeMap<Date, Song> playlist;

    /**
     * Constructs a new playlist that sorts songs by newest first.
     */
    public MusicPlaylist() {
        this.playlist = new TreeMap<>(Collections.reverseOrder());
    }

    /**
     * Adds a song to the playlist with its release date.
     * @param releaseDate The date the song was released
     * @param song The song to add
     */
    public void addSong(Date releaseDate, Song song) {
        playlist.put(releaseDate, song);
        System.out.println("Added '" + song.getTitle() + "' released on " + releaseDate);
    }

    /**
     * Gets the newest song in the playlist.
     * @return The most recently released song or null if empty
     */
    public Song getNewestSong() {
        return playlist.isEmpty() ? null : playlist.firstEntry().getValue();
    }
}