package src;
import src.businesslogic.Person;
import src.businesslogic.MyLife;


/**
 * The Application starts two testcases and prints personal information of persons and prints also results of their current work projects
 * @author Thomas Hein
 */

public class Application {

    public static void main(String[] args) {

            // two-dimensional array with numbers for both testcases
            int[][] unorderedNumbers = {{2, 100, 29, 28, 49, 1, 99, 222}, {2, 100, 29, 500, 49, 1, 99, 222}, {2, 100, 609, 500, 49, 1, 99, 222}};

            // create a person object for the first testcase
            Person john = new Person(30, "John", "chocolate", "running", unorderedNumbers);
            MyLife johnsLive = new MyLife(john);
            System.out.println("Testcase 1 starts");
            johnsLive.start();
            System.out.println("Testcase 1 finished");
            System.out.println("");

            // create a person object for the second testcase
            Person tim = new Person(8, "Tim", "strawberry", "playing table tennis", unorderedNumbers);
            MyLife timsLive = new MyLife(tim);
            System.out.println("Testcase 2 starts");
            timsLive.start();
            System.out.println("Testcase 2 ends");
    }
}
