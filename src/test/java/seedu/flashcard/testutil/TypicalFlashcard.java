package seedu.flashcard.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.flashcard.model.FlashcardList;
import seedu.flashcard.model.flashcard.Flashcard;

/**
 * A utility class containing a list of {@code Flashcard} objects to be used in tests
 */
public class TypicalFlashcard {

    public static final Flashcard MOUNT_BLANC = new FlashcardBuilder().withQuestion("How long is Mount Blanc Tunnel?")
        .withAnswer("11611m").withDefinition("An amazing tunnel between Italy and France")
        .withTag("Geography", "Civil Engineering").withChoice("11611m", "12345m", "54321m").buildMcqFlashcard();
    public static final Flashcard DAXING_AIRPORT = new FlashcardBuilder()
        .withQuestion("Which is the name of the new airport in Beijing?").withAnswer("Daxing Airport")
        .withDefinition("The largest airport in China").withTag("Geography", "Civil Engineering")
        .withChoice("Xiongan Airport", "Daxing Airport", "Lixian Airport", "Zhuque Airport").withScore(2, 2)
            .buildMcqFlashcard();
    public static final Flashcard CHANGI_AIRPORT = new FlashcardBuilder()
        .withQuestion("How many runways does Changi Airport have?").withDefinition("The airport in Singapore")
        .withTag("Civil Engineering").withAnswer("4").buildShortAnswerFlashcard();
    public static final Flashcard TOKYO_AIRPORT = new FlashcardBuilder()
        .withQuestion("How many airports are there in Tokyo?").withDefinition("More than 1").withScore(0, 0)
        .withAnswer("2").buildShortAnswerFlashcard();

    /**
     * Returns an {@code FlashcardList} with all the typical flashcards.
     */
    public static FlashcardList getTypicalFlashcardList() {
        FlashcardList fl = new FlashcardList();
        for (Flashcard flashcard : getTypicalFlashcards()) {
            fl.addFlashcard(flashcard);
        }
        return fl;
    }

    public static List<Flashcard> getTypicalFlashcards() {
        return new ArrayList<>(Arrays.asList(MOUNT_BLANC, DAXING_AIRPORT, CHANGI_AIRPORT, TOKYO_AIRPORT));
    }

    /**
     *To avoid flip command bug where it increments score
     */
    public static List<Flashcard> getTypicalStatsFlashcards() {
        return new ArrayList<>(Arrays.asList(DAXING_AIRPORT, TOKYO_AIRPORT));
    }
}
