package nl.tudelft.jpacman.game;

import nl.tudelft.jpacman.level.PlayerFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FactorySinglePlayerTest
{
    //Instantiate the Player Class
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private final PlayerFactory Factory = new PlayerFactory(SPRITE_STORE);
    private final GameFactory GF = new GameFactory(Factory);

    // I tried very hard to test createSinglePlayerGame, but it became very difficult to initialize everything
    @Test
    void testSP()
    {
        assertThat(GF.getPlayerFactory()).isNotNull();
    }
}
