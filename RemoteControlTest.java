package org.example;


public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light kitchenLight = new KitchenRoomLight();
        Light LivingRoomLight = new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight, 50);

        LightOnCommand LivingRoomLightOn = new LightOnCommand(LivingRoomLight);
        LightOffCommand LivingRoomLightOff = new LightOffCommand(LivingRoomLight);
        LightDimCommand LivingRoomLightDim = new LightDimCommand(LivingRoomLight, 30);

        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, LivingRoomLightOn, LivingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();

        kitchenLightDim.execute();
        kitchenLightDim.undo();

        LivingRoomLightDim.execute();
        LivingRoomLightDim.undo();


    }
    }
