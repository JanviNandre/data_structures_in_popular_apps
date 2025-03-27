/**
 * Demonstrates basic array operations - fixed size collection
 */
public class ArrayDemo {
    private String[] appThemes;

    /**
     * Initializes with default themes
     */
    public ArrayDemo() {
        this.appThemes = new String[]{"Light", "Dark", "Blue"};
    }

    /**
     * Gets theme at specific index
     * @param index position in array
     * @return theme name
     * @throws IndexOutOfBoundsException if invalid index
     */
    public String getTheme(int index) {
        if (index < 0 || index >= appThemes.length) {
            throw new IndexOutOfBoundsException("Invalid theme index");
        }
        return appThemes[index];
    }

    /**
     * @return number of themes available
     */
    public int getThemeCount() {
        return appThemes.length;
    }
}