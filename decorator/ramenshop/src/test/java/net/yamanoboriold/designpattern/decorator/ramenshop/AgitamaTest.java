package net.yamanoboriold.designpattern.decorator.ramenshop;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class AgitamaTest {

    @Test
    public void testGetDescription() {
        assertThat(new Agitama(new MisoSoup()).getDescription()).isEqualTo("味噌スープ 味玉入り");
        assertThat(new Agitama(new TonkotsuSoup()).getDescription()).isEqualTo("豚骨スープ 味玉入り");
    }

    @Test
    public void testCost() {
        assertThat(new Agitama(new MisoSoup()).cost()).isEqualTo(450);
        assertThat(new Agitama(new TonkotsuSoup()).cost()).isEqualTo(400);
    }
}
