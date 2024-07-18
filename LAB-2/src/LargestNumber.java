public class LargestNumber {
    public static int findLargest(int num1, int num2, int num3) {
        int largest = num1;
        if(num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }
        return largest;
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 4, num3 = 7;
        int largestNumber = findLargest(num1, num2, num3);
        System.out.println("The largest number among " + num1 + ", " +num2 + ", " + num3 + " is: " + largestNumber);
    }

}
