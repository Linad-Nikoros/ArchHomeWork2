package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;
import FactoryMethodPattern.ItemGenerator;

public class WoodFabric extends ItemGenerator  {

    @Override
    public IGameItem createItem() {
        return new Wood();
    }    
}
