package NeuralNetLearning;

import java.util.ArrayList;

/**
 * Created by captaincode on 22/02/16.
 */
public class OutputLayer extends Layer{
    public OutputLayer initLayer(OutputLayer outputLayer){
        int numberOfNeuronsInLayer = outputLayer.getNumberOfNeuronsInLayer();
        ArrayList<Neuron> neurons = new ArrayList<>(numberOfNeuronsInLayer);
        ArrayList<Double> listofweightout;

        for(int t=0; t<numberOfNeuronsInLayer; t++){
            Neuron cneuron = new Neuron();
            listofweightout = new ArrayList<>(1);
            listofweightout.add(cneuron.initNeuron());
            cneuron.setListOfWeightOut(listofweightout);
            neurons.add(cneuron);
        }

        outputLayer.setListOfNeurons(neurons);

        return outputLayer;
    }

    public void printLayer(OutputLayer outputLayer){
        ArrayList<Neuron> neurons = outputLayer.getListOfNeurons();
        int numberofneurons = outputLayer.getNumberOfNeuronsInLayer();

        System.out.println("Output Layer");

        for(int i=0; i<numberofneurons; i++){
            System.out.println("Neuron #"+(i+1));
            Neuron neuron = neurons.get(i);
            ArrayList<Double> listOfWeightsOut = neuron.getListOfWeightOut();

            for(int tw=0; tw<listOfWeightsOut.size(); tw++)
                System.out.println("WeightOut #"+(tw+1)+", value: "+listOfWeightsOut.get(tw));
        }
    }
}
