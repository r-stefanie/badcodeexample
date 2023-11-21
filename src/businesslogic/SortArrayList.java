package src.businesslogic;

import java.util.ArrayList;
import java.util.Comparator;

/** this class sorts ArrayLists of type integer in ascending order
 * @author Thomas Hein
 */
public class SortArrayList {

    public SortArrayList () {

    }


    /** sorts numbers in ascending order
     * @param unorderedNumbers ArrayList<Integer>
     * @return ArrayList<Integer> with sorted numbers
     */
    public ArrayList<Integer> sortNumbersAscending (ArrayList<Integer> unorderedNumbers) {
        ArrayList<Integer> numbers;
        numbers = unorderedNumbers;
        numbers.sort(Comparator.naturalOrder());
        return numbers;
        }

    };