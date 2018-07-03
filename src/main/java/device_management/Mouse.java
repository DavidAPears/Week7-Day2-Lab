package device_management;

import Behaviours.IInput;

public class Mouse implements IInput {
    private String type;
    private int noOfButtons;


    public Mouse(String type, int noOfButtons){
        this.type = type;
        this.noOfButtons = noOfButtons;
    }

    public String getType() { return this.type; }

    public int getNoOfButtons() { return this.noOfButtons; }


    public String inputData(String data) {
        return data + " is being used";
    }



}
