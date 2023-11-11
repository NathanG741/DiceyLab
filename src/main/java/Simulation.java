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

        StringBuilder sbr = new StringBuilder("**");
        for (int i = 0; i < bins.getPossibleValues().length; i++) {
            //System.out.println(bins.getBin(i+ bins.getMin()));
            System.out.printf("%2d :   %6d: %.2f %s\n",
                    i+ bins.getMin(),
                    bins.getBin(i+ bins.getMin()),
                    (double) bins.getBin(i+ bins.getMin()) / numberOfTosses,
                    sbr);

            if (i < bins.getPossibleValues().length/2) {
                sbr.append("**");
            } else {
                sbr = new StringBuilder(sbr.substring(0, sbr.length() - 2));
            }
        }
    }

}
