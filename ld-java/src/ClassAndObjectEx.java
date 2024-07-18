public class ClassAndObjectEx {

    //step-2- we have to add the main method and then we have to create the object , add & print fields finally 'call' the method
    public static void main(String[] args) {

        // create an object(reference + instance)
        Television sonyTv;
        sonyTv = new Television();

        // printing the fields
        System.out.println("Serial No. : " +sonyTv.Sno);
        System.out.println("Height : " +sonyTv.height);
        System.out.println("width : " +sonyTv.width);
        System.out.println("Price : " +sonyTv.price);
        System.out.println("Is Available ? " +sonyTv.isAvailable);

        // To call the methods
        sonyTv.switchOn();
        sonyTv.allowHDMiConnection();
    }
}


//step-1 - we have to create the class

class Television {
    //first we have to create fields
    String Sno = "S001";
    byte height = 50;
    byte width = 100;
    float price = 1000.00f;
    boolean isAvailable = true;

    //secondly, methods
    void switchOn() {
        System.out.println("Displays the TV logo");
        System.out.println("Start up the music");
        System.out.println("Menu");
    }
    void allowHDMiConnection() {
        System.out.println("Connect home theatre through HDMI");
    }
}
