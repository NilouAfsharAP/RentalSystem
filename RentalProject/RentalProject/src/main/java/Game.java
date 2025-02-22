
import java.util.*;

public class Game extends Item {
    private final String platform;
    private final String publisher;
    private boolean availableForRent;

    public Game(String title, String genre, Date releaseDate, double rentalFee, String platform, String publisher , long id) {
        super(title, genre, releaseDate, rentalFee, id);
        this.platform = platform;
        this.publisher = publisher;
        this.availableForRent = true;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public boolean isAvailableForRent() {
        return availableForRent;
    }

    public void setAvailableForRent(boolean availableForRent) {
        this.availableForRent = availableForRent;
    }

}
