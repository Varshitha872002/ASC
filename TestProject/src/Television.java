public class Television {
    String model = "Sony Some Model";
    int width;
    int height;
    float price;
    String color;
    boolean availble;
    // create methods

    void displayDetails(){
        System.out.println(model);
        System.out.println("The width of the TV is : " + width);
        System.out.println("Total price : "  + (price + 5000));
        System.out.println(color);
        System.out.println(availble);
    }
}
