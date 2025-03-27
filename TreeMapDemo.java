import java.util.Map;
import java.util.TreeMap;

/**
 * Demonstrates TreeMap - automatically sorted map
 */
public class TreeMapDemo {
    private TreeMap<Integer, String> studentRecords = new TreeMap<>();

    /**
     * Adds student record
     * @param id student ID
     * @param name student name
     */
    public void addStudent(int id, String name) {
        studentRecords.put(id, name);
        System.out.println("Added student: " + id + " - " + name);
    }

    /**
     * Gets student with highest ID
     * @return name of student with max ID
     */
    public String getLastStudent() {
        return studentRecords.lastEntry().getValue();
    }

    /**
     * Prints all students in ID order
     */
    public void printAllStudents() {
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}