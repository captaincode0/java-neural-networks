package NeuralNetLearning;
import java.util.ArrayList;

/**
 * Created by captaincode on 22/02/16.
 */
public class NeuralNet {
    private InputLayer inputLayer;
    private HiddenLayer hiddenLayer;
    private ArrayList<HiddenLayer> listOfHiddenLayer;
    private OutputLayer outputLayer;
    private int numberOfHiddenLayers;

    /**
     * The values to init this neural networks are
     * InputLayer: Two neurons in the input layer.
     * HiddenLayer: Two hidden layers with tree neurons each.
     * OutputLayer: One neuron in the output layer.
     */

    public void initNeuronalNetwork(){
        inputLayer = new InputLayer();
        inputLayer.setNumberOfNeuronsInLayer(2);
        inputLayer = inputLayer.initLayer(inputLayer);

        numberOfHiddenLayers = 2;
        listOfHiddenLayer = new ArrayList<>(numberOfHiddenLayers);
        for(int i=0; i<numberOfHiddenLayers; i++){
            hiddenLayer = new HiddenLayer();
            hiddenLayer.setNumberOfNeuronsInLayer(3);
            listOfHiddenLayer.add(hiddenLayer);
        }

        outputLayer = new OutputLayer();
        outputLayer.setNumberOfNeuronsInLayer(1);
        outputLayer = outputLayer.initLayer(outputLayer);

        listOfHiddenLayer = hiddenLayer.initLayer(
                hiddenLayer,
                listOfHiddenLayer,
                inputLayer,
                outputLayer
        );
    }

    public void watchNeuralNetwork(){
        inputLayer.printLayer(inputLayer);
        hiddenLayer.printLayer(listOfHiddenLayer);
        outputLayer.printLayer(outputLayer);
    }
}
