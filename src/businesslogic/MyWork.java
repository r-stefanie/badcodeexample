package src.businesslogic;
import java.util.ArrayList;


/**
 * Prints the result of a current project of a person
 * @author Thomas Hein
 */
public class MyWork {

    // two-dimensional array with unordered numbers for the work project
    private int[][] unorderedNumbers;

   // class with a sorting method for the work project
   SortArrayList sortMyList = new SortArrayList();

    /** Constructor with a person object
     * @param person Person Object
     */
    public MyWork (Person person) {
        this.unorderedNumbers = person.getUnorderedNumbers();
    }

    public void start() {
        printTaskIntroduction();
        printTaskResult();
        printTaskDescription();
    }

    // prints the description of the task, the person is working on
    private void printTaskIntroduction () {
        System.out.println("Then I need to work, currently I am working on a real hard mathematical problem.");
        System.out.println("I think I find a good algorithm for it.");
    };

    // loops over the array with unordered numbers, sorts the numbers in ascending order and finds the highest number in the list
    private void printTaskResult () {
        ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < unorderedNumbers.length; i++) {
                numbers.clear();
                for(int j = 0; j < unorderedNumbers[i].length; j++) {
                    numbers.add(unorderedNumbers[i][j]);
                }
                ArrayList<Integer> resultNumbers = sortMyList.sortNumbersAscending(numbers);
                System.out.println("The result of my problem for " + resultNumbers + " is: " + resultNumbers.get(numbers.size()-1));
            }
        };

    // prints the description of the task and what the person will do after work
    private void printTaskDescription () {
        System.out.println("I sort numbers ascending and find the highest number.");
        System.out.println("Afterwards I need to eat again, I am hungry. And then I go to bad");
    };




}
