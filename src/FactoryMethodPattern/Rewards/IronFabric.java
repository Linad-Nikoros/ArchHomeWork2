package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;
import FactoryMethodPattern.ItemGenerator;

public class IronFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Iron();
    }    
}
