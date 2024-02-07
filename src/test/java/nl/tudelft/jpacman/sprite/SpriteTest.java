package nl.tudelft.jpacman.sprite;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.ObjectAssert;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpriteTest
{
    private final PacManSprites sprites = new PacManSprites();
    // Sprite list, int frames, bool loop

    private final AnimatedSprite deathAnimation = sprites.getPacManDeathAnimation();

    @Test
    void spriteDrawn()
    {
        assertThat(sprites.getPelletSprite()).isNotNull();
    }

    @Test
    void checkHeightOfDeathAnimation()
    {
        assertThat(deathAnimation.getHeight()).isBetween(0, 100);
    }
}
