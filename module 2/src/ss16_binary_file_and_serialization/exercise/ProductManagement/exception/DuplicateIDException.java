package ss16_binary_file_and_serialization.exercise.ProductManagement.exception;

public class DuplicateIDException extends Throwable{
    public DuplicateIDException(String message) {
        super(message);
    }
}
