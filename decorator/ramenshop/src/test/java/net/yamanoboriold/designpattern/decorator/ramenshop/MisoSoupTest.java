package net.yamanoboriold.designpattern.decorator.ramenshop;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class MisoSoupTest {

    @Test
    public void testGetDescription() {
        assertThat(new MisoSoup().getDescription()).isEqualTo("味噌スープ");
    }

    @Test
    public void testCost() {
        assertThat(new MisoSoup().cost()).isEqualTo(350);
    }
}
