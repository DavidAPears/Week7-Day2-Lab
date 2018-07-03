package device_management;

import Behaviours.IInput;

public class Keyboard implements IInput {
    private String type;
    private int noOfKeys;

    public Keyboard(String type, int noOfKeys) {
        this.type =type;
        this.noOfKeys =noOfKeys;
    }

    public String getType() { return this.type; }

    public int getNoOfKeys() { return this.noOfKeys; }


    public String inputData(String data) {
        return data + " is being used";
    }
}
