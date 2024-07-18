public class MethAdd {
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
        MethAdd sum = new MethAdd();
        System.out.println(sum.add(10,20));
        System.out.println(sum.add(10,20, 30));
        System.out.println(sum.add(10.5,20.1));
        System.out.println(sum.add("Hello" ,20));
    }
}
