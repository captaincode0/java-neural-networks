package BaseNetwork;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by captaincode on 21/02/16.
 */
public class Neuron {
    private ArrayList<Double> listOfWeightIn;
    private ArrayList<Double> listOfWeightOut;

    public double initNeuron(){
        Random r = new Random();
        return r.nextDouble();
    }

    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn){
        this.listOfWeightIn = listOfWeightIn;
    }

    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut){
        this.listOfWeightOut = listOfWeightOut;
    }

    public ArrayList<Double> getListOfWeightIn(){
        return this.listOfWeightIn;
    }

    public ArrayList<Double> getListOfWeightOut(){
        return this.getListOfWeightOut();
    }
}
