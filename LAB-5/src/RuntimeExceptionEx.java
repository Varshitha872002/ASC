// Create a RuntimeException WrongInputException.
// Override all the constructors from the super class

public class RuntimeExceptionEx {


        static void ValidInput ( int a){
            if (a < 0) {
              //   throw new RuntimeException("Input is not valid");
                throw new WrongInputException("Input is not valid");
            } else {
                System.out.println(a);
            }
        }

        public static void main (String[]args){
            try {
                ValidInput(-5);
            }
          //  catch (RuntimeException runtimeException) {
            catch (WrongInputException wrongInputException) {
            //    System.out.println(runtimeException.getMessage());
                System.out.println(wrongInputException.getMessage());
            }
        }
    }

