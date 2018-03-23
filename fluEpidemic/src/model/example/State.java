package model.example;


/**
 * The state of something living in the flu simulation.
 *
 * @author <a href="mailto:sander@unice.fr">2018 Peter Sander</a>"
 */
enum State {
    HEALTHY("healthy"),
    SICK("sick"),
    CONTAGIOUS("contagious"),
    RECOVERING("recovering"),
    DEAD("dead");
    private String state = "";

    //Constructor
    State(String state) {
        this.state = state;
    }
    //Method to change status to String
    public String toString() {
        return this.state;
    }
}
