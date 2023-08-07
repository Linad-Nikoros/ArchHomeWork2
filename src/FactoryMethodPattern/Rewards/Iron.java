package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;

public class Iron implements IGameItem {

    @Override
    public void open() {
        System.out.println("Iron!"); 
    }
}
