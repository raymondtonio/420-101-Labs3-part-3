
/**
 * Write a description of class TuneCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TuneCreator
{
    // instance variables - replace the example below with your own
    private MidiPlayer player;

    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
        // initialise instance variables
        player = new MidiPlayer();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void CreatAndPlay()
    {
        // Step 1: Create a SimpleTune object.
        SimpleTune tune = new SimpleTune();
        tune.setInstrument(5); // choose an instrument
        tune.addNote("C",6);  // add notes
        tune.addNote("B",8);
        tune.addNote("D",10);
        tune.addNote("F",12);
        player.playTune(tune);  // play the tune!
    }
}