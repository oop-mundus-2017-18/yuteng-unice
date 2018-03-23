package model.example;

public enum Virus {
    H1N1(0.2, 0.1), H5N1(0.4, 0.33),
    // These viruses are to eliminate randomness -
    //  for testing only.
    MINI4TESTING(0, 0), MAXI4TESTING(1, 1);

    private double virulence;
    private double mortality;

    Virus(double virulence, double mortality) {
        this.virulence = virulence;
        this.mortality = mortality;
    }

    double virulence() {
        return virulence;
    }

    double mortality() {
        return mortality;
    }
}
