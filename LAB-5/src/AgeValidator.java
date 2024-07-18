public class AgeValidator {
    public String getAgeCode(int age) throws InvalidAgeException {
        if(age < 0) {
            throw new InvalidAgeException("Age is not valid");
        }
        else if (age <= 18) {
            return "Child";
        }
        else  {
            return "Adult";
        }
    }
}
