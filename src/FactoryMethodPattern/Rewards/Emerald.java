package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;

public class Emerald implements IGameItem{

    @Override
    public void open() {
        System.out.println("Emerald!");
    }    
}
