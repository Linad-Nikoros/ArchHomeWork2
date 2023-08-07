package FactoryMethodPattern.Rewards;
import FactoryMethodPattern.IGameItem;
import FactoryMethodPattern.ItemGenerator;

public class GoldFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gold();
    } 
}
