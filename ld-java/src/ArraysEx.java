import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {

        char[] consonents = {'h', 'c', 'j', 'f', 'g'};
        Arrays.sort(consonents);

        // the below statement sorts the consonents in ascending order

        System.out.println("Sorted array in ascending order: " +Arrays.toString(consonents));
        for(int i = 0; i<consonents.length; i++) {
         System.out.println(consonents[i]);
        }

        //sort the array descending order
        char[] reverse = new char[consonents.length];
        for(int i=0; i<consonents.length; i++) {
            reverse[i] = consonents[consonents.length - 1 - i];
        }
        System.out.println("Sorted array in descending order:" +Arrays.toString(reverse));
        String customToString = "[";
        for(int i = 0; i<consonents.length; i++) {
            if(i == (consonents.length - 1)) {
                customToString = customToString + consonents[i];
            }
            else {
                customToString = customToString + consonents[i] + ",";
            }
        }
        customToString += "]";
        System.err.println(customToString);

        //Normal(linear) search for an element in the array

        char searchchar = 'g';
        int index = -1;
        for(int i = 0; i<consonents.length; i++) {
            if (consonents[i] == searchchar) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            System.out.println("Element " + searchchar + " found at index: " + index );
        }
        else {
            System.out.println("Element" + searchchar + "not found in the array.");
        }

    }
}
