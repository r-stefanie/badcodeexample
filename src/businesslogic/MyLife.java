package src.businesslogic;
import src.businesslogic.Person;
import java.util.ArrayList;
import java.util.Comparator;

/** prints personal information of a person
 * @author Thomas Hein
 */

public class MyLife {
    private Person me;
    private int age;
    private String name;
    private String favoriteFlavor;
    private String favoriteActivity;
    private int[][] unorderedNumbers;


    /**
     * @param person a Person object
     */
    public MyLife(Person person) {
        this.me = person;
        this.age = person.getAge();
        this.name = person.getName();
        this.favoriteFlavor = person.getFavoriteFlavor();
        this.favoriteActivity = person.getFavoriteActivity();
        this.unorderedNumbers = person.getUnorderedNumbers();
    }

    // prints the introduction about the person, the favorite food and activity and the results of the work
    public void start() {
        printIntroduction();
        printFavouriteFood();
        printFavouriteActivity();
        printWork();
    }

    // prints introduction
    private void printIntroduction () {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    };

    // prints favorite food
    private void printFavouriteFood () {
        System.out.println("I need to wake up in the morning and eat " + favoriteFlavor + " flavored " + getFavoriteFood(age));
    };

    // prints favorite activity
    private void printFavouriteActivity () {
        System.out.println("Then I do my favorite activity: " + favoriteActivity + " with a "+ getIntensity(age) +" intensity.");
    };

    // creates an instance of the class MyWork and starts the printing process
    private void printWork() {
        MyWork myWork = new MyWork(me);
        myWork.start();
    };

    // returns a string with the favorite food depending on the age of the person
    private String getFavoriteFood (int age) {
        //string deklarieren, wert wird später zugewiesen
        String favoriteFood;
        if(age < 12) {
            favoriteFood = "Cornflakes";
        } else if(age < 30) {
            favoriteFood = "Power Cornflakes";
        } else if(age < 40) {
            favoriteFood = "Power Cornflakes without extra sugar";
        } else if (age > 40 && !(age > 60)) {
            favoriteFood = "Power Cornflakes without extra sugar and with extra vitamins";
        } else {
            favoriteFood = "ice cream";
        }
        return favoriteFood;
    };

    // returns a string with the intensity depending on the age of the person
    private String getIntensity (int age) {

        String in;

        if(age < 12) {
            in = "powerful";
        } else if(age < 30 ) {
            in = "playfull";
        } else if(age < 40) {
            in = "exhausting";
        } else if (age > 40 && !(age > 60)) {
            in = "motivated";
        } else {
            in = "powerful";
        }
        return in;
    };
}
