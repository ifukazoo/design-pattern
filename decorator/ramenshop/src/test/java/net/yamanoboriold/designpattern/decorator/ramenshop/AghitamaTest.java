package net.yamanoboriold.designpattern.decorator.ramenshop;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class AghitamaTest {

    @Test
    public void testGetDescription() {
        assertThat(new Aghitama(new MisoSoup()).getDescription()).isEqualTo("味噌スープ 味玉入り");
        assertThat(new Aghitama(new TonkotsuSoup()).getDescription()).isEqualTo("豚骨スープ 味玉入り");
    }

    @Test
    public void testCost() {
        assertThat(new Aghitama(new MisoSoup()).cost()).isEqualTo(450);
        assertThat(new Aghitama(new TonkotsuSoup()).cost()).isEqualTo(400);
    }
}
