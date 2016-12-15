package net.yamanoboriold.designpattern.decorator.ramenshop;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class TonkotsuSoupTest {

    @Test
    public void testGetDescription() {
        assertThat(new TonkotsuSoup().getDescription()).isEqualTo("豚骨スープ");
    }

    @Test
    public void testCost() {
        assertThat(new TonkotsuSoup().cost()).isEqualTo(300);
    }
}
