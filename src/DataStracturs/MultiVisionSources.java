package DataStracturs;
import java.util.ArrayList;
import java.util.Collection;


public class MultiVisionSources {


    private final ArrayList<float[]> observations;

    public MultiVisionSources(ArrayList<float[]> observations) {
        this.observations = observations;
    }


    public void addObservation(float[] observation) {
        observations.add(observation);
    }

    public Collection<float[]> getGoodObservations() {
        ArrayList<float[]> goodObservations = new ArrayList<>();
        for (float[] observation : observations) {
            if (observation[2] < 0.01f) { // Checks if the robot is on the ground
                goodObservations.add(observation);
            }
        }
        return goodObservations;
    }


}
