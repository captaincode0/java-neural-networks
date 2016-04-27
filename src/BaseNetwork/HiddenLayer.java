package BaseNetwork;

import java.util.ArrayList;

/**
 * Created by captaincode on 22/02/16.
 */
public class HiddenLayer extends Layer{
    public ArrayList<HiddenLayer> initLayer(HiddenLayer hiddenLayer, ArrayList<HiddenLayer> listOfHiddenLayer, InputLayer inputLayer, OutputLayer outputLayer){


        return listOfHiddenLayer;
    }

    public void printLayer(ArrayList<HiddenLayer> listOfHiddenLayer){
        for(int i=0; i<listOfHiddenLayer.size(); i++){
            System.out.println("Hidden Layer #"+(i+1));
            HiddenLayer hiddenLayer = listOfHiddenLayer.get(i);
            ArrayList<Neuron> neurons = hiddenLayer.getListOfNeurons();
            int numberofneurons = hiddenLayer.getNumberOfNeuronsInLayer();

            for(int j=0; j<numberofneurons; j++){
                ArrayList<Double> listofweightin = neurons.get(j).getListOfWeightIn(),
                    listofweightout = neurons.get(j).getListOfWeightOut();
                System.out.println("Neuron #"+(j+1));

                for(int z=0; z<listofweightin.size(); z++)
                    System.out.println("Weight in#"+(z+1)+", value: "+listofweightin.get(z));

                for(int w=0; w<listofweightout.size(); w++)
                    System.out.println("Weight out#"+(w+1)+", value:"+listofweightout.get(w));
            }

        }
    }
}
