package seedu.flashcard.commons.exceptions;

/**
 * The signal that the given data does not fulfill some constraints.
 */
public class IllegalValueException extends Exception {

    /**
     * @param message should contain relevant information on the failed constraints.
     */
    public IllegalValueException(String message) {
        super(message);
    }
}
