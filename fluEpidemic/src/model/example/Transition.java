package model.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


/**
 * Determines how something living passes from one state to
 * its next state.
 * Creates a two-key map (state, event) with values which are
 * probabilistic transition functions yielding a state.
 * The probabilities of passing from one state to the next
 * are determined by a specific virus.
 *
 * @author <a href="mailto:sander@unice.fr">2018 Peter Sander</a>"
 */
@SuppressWarnings("serial")
class Transition {
    double mortality;  // default access for testing only
    double virulence;
    double contagiousness = 0.9;
    final Map<State, Map<Event, Supplier<State>>> transitions
            = new HashMap<>();

    /**
     * Constructor.
     * Initializes the two-key map.
     * @param virus Determines transition probabilities.
     */
//    Transition(Virus virus) {
//        mortality = virus.mortality();
//        virulence = virus.virulence();
//        put(HEALTHY, CONTACT_WITH_CONTAGIOUS_PERSON,
//                () -> happens(virulence)
//                    ? INFECTED
//                    : HEALTHY);
//    }

    /**
     * Puts a transition function value into the two-key map for given
     * state and event keys.
     * @param state Key.
     * @param event Key.
     * @param fn Value. A probabilistic function (see the constructor).
     */
    private void put(State state, Event event, Supplier<State> fn) {
        if (transitions.get(state) == null) {  // no value for state key
            transitions.put(state, new HashMap<>());
        }
        transitions.get(state).put(event, fn);
    }

    /**
     * Gets a transition function value from the two-key map for given
     * state and event keys.
     * @param state Key.
     * @param event Key.
     * @return Value. A probabilistic function (see the constructor).
     */
    private Supplier<State> get(State state, Event event) {
        return transitions.get(state).get(event);
    }

    /**
     * Determines the next state from the current state and event
     * keys by executing the transition function.
     * @param
     * @param event Key.
     * @return Next state.
     */
    State nextState(State currentState, Event event) {
        Supplier<State> fn = get(currentState, event);
        return fn != null ? fn.get() : currentState;
    }

    /**
     * Determines whether a transition happens (or not) based on a
     * random value.
     * @param chance Probability of the transition happening.
     */
    boolean happens(double chance) {
        return Math.random() < chance;
    }
}
