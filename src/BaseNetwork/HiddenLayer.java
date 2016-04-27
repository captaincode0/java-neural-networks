package BaseNetwork;

import java.util.ArrayList;

/**
 * Created by captaincode on 22/02/16.
 */
public class HiddenLayer extends Layer{
    public ArrayList<HiddenLayer> initLayer(HiddenLayer hiddenLayer, ArrayList<HiddenLayer> listOfHiddenLayer, InputLayer inputLayer, OutputLayer outputLayer){
        ArrayList<Double> listOfWeightIn = new ArrayList<>(),
            listOfWeightOut = new ArrayList<>();
        ArrayList<Neuron> hiddenLayerNeurons = new ArrayList<>();
        int numberOfHiddenLayers = listOfHiddenLayer.size();

        for(int i=0; i<numberOfHiddenLayers; i++){
            for(int j=0; j<hiddenLayer.getNumberOfNeuronsInLayer(); j++){
                Neuron neuron = new Neuron();
                int limitin, limitout;

                if(i==0){
                    limitin = inputLayer.getNumberOfNeuronsInLayer();
                    if(numberOfHiddenLayers > 1)
                        limitout = listOfHiddenLayer.get(i+1).getNumberOfNeuronsInLayer();
                    else
                        limitout = listOfHiddenLayer.get(i).getNumberOfNeuronsInLayer();
                 }
                else if(i == numberOfHiddenLayers -1){
                    limitin = listOfHiddenLayer.get(i-1).getNumberOfNeuronsInLayer();
                    limitout = outputLayer.getNumberOfNeuronsInLayer();
                }
                else{
                    limitin = listOfHiddenLayer.get(i-1).getNumberOfNeuronsInLayer();
                    limitout = listOfHiddenLayer.get(i+1).getNumberOfNeuronsInLayer();
                }

                for(int x=0; x<limitin; x++)
                    listOfWeightIn.add(neuron.initNeuron());

                for(int z=0; z<limitout; z++)
                    listOfWeightOut.add(neuron.initNeuron());

                neuron.setListOfWeightIn(listOfWeightIn);
                neuron.setListOfWeightOut(listOfWeightOut);
                hiddenLayerNeurons.add(neuron);

                listOfWeightIn = new ArrayList<>();
                listOfWeightOut = new ArrayList<>();
            }
            listOfHiddenLayer.get(i).setListOfNeurons(hiddenLayerNeurons);
            hiddenLayerNeurons = new ArrayList<>();
        }

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
