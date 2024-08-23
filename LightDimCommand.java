package org.example;

public class LightDimCommand implements Command{
    private Light light;
    private int preBrightness;
    private int newBrightness;
    public LightDimCommand(Light light, int brightness){
        this.light=light;
        this.newBrightness=brightness;
    }
    @Override
    public void undo() {
        light.dim(preBrightness);

    }

    @Override
    public void execute() {
        preBrightness=light.getBrightness();
        light.dim(newBrightness);

    }
}
