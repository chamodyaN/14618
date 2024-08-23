package org.example;

public abstract class Beverages {
    private boolean wantsExtras;
    public void boilWater(){
        System.out.println("Boiling Water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    public void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }
    public boolean isWantsExtras(){
        return wantsExtras;
    }
    public final void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras){
            addExtras();
        }
    }
    protected abstract void brew();
    protected abstract void addCondiments();
    protected abstract void addExtras();
}
