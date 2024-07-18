import java.util.Scanner;

public class DetailsofAgeAndLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LearningModule learningModule = new LearningModule();
        try {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Age: ");
            int age = scanner.nextInt();

            String learningCode = learningModule.getLearningCode(name, age);
            System.out.println("Learning code: " + learningCode);
        }
        catch (WrongInputException wrongInputException) {
            System.out.println(wrongInputException.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
