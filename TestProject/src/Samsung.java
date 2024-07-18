public class Samsung {
    String model = "Galaxy";
    int ram = 16;
    int rom = 256;
    float cost = 50000;
    String colour = "Black";
    void displayResults() {
        System.out.println("Model name: " + model);
        System.out.println("RAM: " + (ram+"GB"));
        System.out.println("ROM: " + (rom+"GB"));
        System.out.println("Price: " + cost);
        System.out.println("Color: " + colour);
    }

    public static void main(String[] args) {
        Samsung myPhn;
        myPhn = new Samsung();
        myPhn.displayResults();
    }
}
