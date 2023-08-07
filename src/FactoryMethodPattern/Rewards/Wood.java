package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;

public class Wood implements IGameItem {

    @Override
    public void open() {
        System.out.println("Wood");
    }    
}
