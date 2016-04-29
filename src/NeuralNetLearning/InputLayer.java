package NeuralNetLearning;

import java.util.ArrayList;

/**
 * Created by captaincode on 22/02/16.
 */
public class InputLayer extends Layer {
    public InputLayer initLayer(InputLayer inputLayer) {
        int numberOfNeuronsInLayer = inputLayer.getNumberOfNeuronsInLayer();
        ArrayList<Neuron> neurons = new ArrayList<>(numberOfNeuronsInLayer);
        ArrayList<Double> listofweightin;

        for(int j=0; j<numberOfNeuronsInLayer; j++){
            listofweightin = new ArrayList<>();
            Neuron cneuron = new Neuron();
            listofweightin.add(cneuron.initNeuron());
            cneuron.setListOfWeightIn(listofweightin);
            neurons.add(cneuron);
        }

        inputLayer.setListOfNeurons(neurons);

        return inputLayer;
    }

    public void printLayer(InputLayer inputLayer){
        ArrayList<Neuron> neuronslist = inputLayer.getListOfNeurons();
        int neuronsnumber = inputLayer.getNumberOfNeuronsInLayer();

        System.out.println("Input Layer");
        System.out.println("Number of neurons: "+neuronsnumber);

        for(int i=0; i<neuronsnumber; i++){
            System.out.println("Neuron #"+(i+1));
            Neuron neuron = neuronslist.get(i);
            ArrayList<Double> listofweightin = neuron.getListOfWeightIn();
            for(int j=0; j<listofweightin.size(); j++)
                System.out.println("WeightIn #"+(j+1)+", value: "+listofweightin.get(j));
        }
    }
}
