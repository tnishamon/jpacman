package nl.tudelft.jpacman.level;

// Import different classes and functions
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest
{

    //Instantiate the Player Class
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private final PlayerFactory Factory = new PlayerFactory(SPRITE_STORE);
    private final Player ThePlayer = Factory.createPacMan();

    //Test if the Player is alive

    @Test
    void testAlive()
    {
        assertThat(ThePlayer.isAlive()).isEqualTo(true);
    }
}

