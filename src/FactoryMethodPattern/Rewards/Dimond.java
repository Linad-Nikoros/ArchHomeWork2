package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;

public class Dimond implements IGameItem {

    @Override
    public void open() {
        System.out.println("Dimonds!");
    }    
}
