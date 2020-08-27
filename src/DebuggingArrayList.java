import java.util.ArrayList;
import java.util.Arrays;

public class DebuggingArrayList {

    public static void main(String args[]) {
// create an array list
        ArrayList<String> al = new ArrayList<>(); // this is al, as in letter 'L', short for array-list

        System.out.println("Initial size of al: " + al.size());
// add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("F");
        al.add("G");
        al.set(1, "A2");

        System.out.println("Size of al after additions: " + al.size());
// display the array list
        System.out.println("Contents of al: " + al);
// Remove elements from the array list
        al.remove("F");
//        al.remove("G");
        al.remove("G");
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}
