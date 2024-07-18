public class LearningModule {
    public String getLearningCode(String name, int age) throws WrongInputException {
        AgeValidator ageValidator = new AgeValidator();
        try {
            String ageCode = ageValidator.getAgeCode(age);
            return ageCode;
        }
        catch (InvalidAgeException invalidAgeException) {
            throw new WrongInputException("Invalid age: "+ invalidAgeException.getMessage(), invalidAgeException);
        }
    }
}
