package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;
import FactoryMethodPattern.ItemGenerator;

public class DimondFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Dimond();    
    }
}