public class Simulation {

    int numberOfDice = 2;
    int numberOfTosses = 10;

    /*
   =================================================================
   =================================================================
    */
// Constructors

public Simulation(int numberOfDice, int numberOfTosses){
    this.numberOfDice = numberOfDice;
    this.numberOfTosses = numberOfTosses;
    }
    public void runSimulation(){
    Dice dice = new Dice(this.numberOfDice);
    Bins bins = new Bins(numberOfDice, this.numberOfDice * 6);

        for(int i = 0; i < this.numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

}
