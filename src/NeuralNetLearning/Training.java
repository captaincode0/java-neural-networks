package NeuralNetLearning;

import java.util.ArrayList;

/**
 * Created by captaincode on 28/04/16.
 */
public class Training {
    private int epochs;
    private double error;
    private double mse;

    private enum TrainingTypesENUM{
        PERCEPTRON, ADALINE
    }

    private enum ActivationFncENUM {
        STEP, LINEAR, SIGLOG, HYPERTAN
    }

    public NeuralNet train(NeuralNet neural_network){
        return neural_network;
    }

    public ArrayList<Neuron> teachNeuronsOfLayer(int numberOfInputNeurons, int line, NeuralNet net, double netValue){
        return null;
    }

    private double calcNewWeight(TrainingTypesENUM trainType, double inputWeightOld, NeuralNet net, double error, double trainSample, double netValue){
        return 0.0;
    }
}
