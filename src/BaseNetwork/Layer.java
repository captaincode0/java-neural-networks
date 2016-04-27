package BaseNetwork;

import java.util.ArrayList;

/**
 * Created by captaincode on 21/02/16.
    @{abstract}
    Implemented in InputLayer, OutputLayer, HiddenLayer.
 */
public class Layer {
    private ArrayList<Neuron> listOfNeurons;
    private int numberOfNeuronsInLayer;

    public ArrayList<Neuron> getListOfNeurons(){
        return this.listOfNeurons;
    }

    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons){
        this.listOfNeurons = listOfNeurons;
    }

    public int getNumberOfNeuronsInLayer(){
        return this.numberOfNeuronsInLayer;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer){
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }
}
