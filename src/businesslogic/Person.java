package src.businesslogic;

/**
 * This class creates a Person Object
 * @author Thomas Hein
 */
public class Person {

    private int age;
    private String name;
    private String favoriteFlavor;
    private String favoriteActivity;
    private int[][] unorderedNumbers;

    /**
     * @param age as int
     * @param name as string
     * @param favoriteFlavor as string
     * @param favoriteActivity as string
     * @param unorderedNumbers as two-dimensional array of type int
     */
    public Person(int age, String name, String favoriteFlavor, String favoriteActivity, int[][] unorderedNumbers) {
        this.age = age;
        this.name = name;
        this.favoriteFlavor = favoriteFlavor;
        this.favoriteActivity = favoriteActivity;
        this.unorderedNumbers = unorderedNumbers;
    }

    // returns the age of the person
    public int getAge() {
        return age;
    }

    // returns the name of the person
    public String getName() {
        return name;
    }

    // returns the favorite flavor of the person
    public String getFavoriteFlavor() {
        return favoriteFlavor;
    }

    // returns the favorite activity of the person
    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    // returns the numbers of the person
    public int[][] getUnorderedNumbers() {
        return unorderedNumbers;
    }
}
