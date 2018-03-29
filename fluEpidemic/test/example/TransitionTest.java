package example;

import javafx.animation.Transition;
import org.junit.Before;
import org.junit.Test;

import static model.state.StateType.HEALTHY;
import static org.junit.Assert.*;
import static flu.example.Event.*;
import static flu.example.State.*;
import static flu.example.Virus.*;

public class TransitionTest {
    private Transition transMini = null;
    private Transition transMaxi = null;

    @Before
    public void setUp() {
        transMini = new Transition(MINI4TESTING);
        transMaxi = new Transition(MAXI4TESTING);
    }

    @Test
    public void healthy2healthy() {
        assertEquals(HEALTHY,
                transMini.nextState(HEALTHY,
                        INCUBATION_TIME_PASSES));
    }

    @Test
    public void healthy2() {
        assertEquals(HEALTHY,
                transMini.nextState(HEALTHY,
                        CONTACT_WITH_CONTAGIOUS_PERSON));
        assertEquals(INFECTED,
                transMaxi.nextState(HEALTHY,
                        CONTACT_WITH_CONTAGIOUS_PERSON));
    }
}
