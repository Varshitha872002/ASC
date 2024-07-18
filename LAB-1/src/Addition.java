public class Addition {
    int add(int a, int b) {
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
    double add(double a, double b) {
        return a+b;
    }
    String add(String str, int n) {
        return str + " " + n;
    }

    public static void main(String[] args) {
        Addition sum = new Addition();
        int sum1 = sum.add(10, 20);
        System.out.println(sum1);
        int sum2 = sum.add(10,20,30);
        System.out.println(sum2);
        double sum3 = sum.add(10.5, 20.1);
        System.out.println(sum3);
        String sum4 = sum.add("Hello", 20);
        System.out.println(sum4);
    }
}
