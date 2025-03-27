import java.util.LinkedList;

/**
 * Implements a music playlist queue using LinkedList.
 * Demonstrates FIFO (First-In-First-Out) operations for song playback.
 */
public class MusicQueue {
    private final LinkedList<Song> playlist = new LinkedList<>();

    /**
     * Adds a song to the end of the queue.
     * @param song The song to add to the queue
     * @throws IllegalArgumentException if song is null
     */
    public void addSong(Song song) {
        if (song == null) {
            throw new IllegalArgumentException("Song cannot be null");
        }
        playlist.addLast(song);
        System.out.println("Added to queue: " + song.getTitle());
    }

    /**
     * Plays the next song in the queue (removes it from the queue).
     * @return The next song to play, or null if queue is empty
     */
    public Song playNext() {
        if (playlist.isEmpty()) {
            System.out.println("Queue is empty - no songs to play");
            return null;
        }
        Song nextSong = playlist.removeFirst();
        System.out.println("Now playing: " + nextSong.getTitle());
        return nextSong;
    }

    /**
     * Checks if the queue is empty.
     * @return true if queue has no songs, false otherwise
     */
    public boolean isEmpty() {
        return playlist.isEmpty();
    }

    /**
     * Gets the number of songs in the queue.
     * @return The current size of the playlist
     */
    public int getQueueSize() {
        return playlist.size();
    }
}