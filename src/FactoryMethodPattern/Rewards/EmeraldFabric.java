package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;
import FactoryMethodPattern.ItemGenerator;

public class EmeraldFabric extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Emerald();
    }    
}
