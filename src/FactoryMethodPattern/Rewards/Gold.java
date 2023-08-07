package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;

public class Gold implements IGameItem {

    @Override
    public void open() {
        System.out.println("Gold!");
    
    }    
}
