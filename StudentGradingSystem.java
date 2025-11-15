class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}
public class StudentGradingSystem {
    public static void main(String[] args) {
        int marks = 105; // Example marks

        try {
            validateMarks(marks);
            System.out.println("Marks are valid: " + marks);
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void validateMarks(int marks) throws InvalidGradeException {
        if (marks > 100) {
            throw new InvalidGradeException("Marks cannot exceed 100. Entered: " + marks);
        }
    }
}
