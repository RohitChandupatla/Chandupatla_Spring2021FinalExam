
  
/**
 * 
 */
package Question10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author Rohit Reddy Chandupatla
 *
 */
public class BinaryRecursion {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		while (list.size() < 10) {
			list.add((int) ((Math.random() *10) +1));
		}

		// binary Search works only on sorted elements
		Collections.sort(list);
                System.out.println("By Rohit Reddy Chandupatla");
		System.out.println("List of num to search from are :");
		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + " ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number that has to be searched :");
		int x = sc.nextInt();
		sc.close();
		boolean result = binarySearch(list, 0, list.size() - 1, x);
		if (result)
			System.out.println("Number found");
	else
			System.out.println("Number not found");

	}
	// method for binarySearch given the arraylist using recursion, left, right and
	// search number

    /**
     *
     * @param list
     * @param l
     * @param r
     * @param x
     * @return
     */
	public static boolean binarySearch(ArrayList<Integer> list, int l, int r, int x) {
		if (r >= l) {
			int center = l + (r - l) / 2;

			// If the number is present at the center
			if (list.get(center) == x) {
				return true;
			}
			// If number is smaller than center
			if (x < list.get(center)) {
				return binarySearch(list, l, center - 1, x);
			}
			// If number is greater than center
			else {
				return binarySearch(list, center + 1, r, x);
			}
		}
		// We reach here when the number is not present
		return false;
	}
}
