package FactoryMethodPattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import FactoryMethodPattern.Rewards.DimondFabric;
import FactoryMethodPattern.Rewards.EmeraldFabric;
import FactoryMethodPattern.Rewards.GoldFabric;
import FactoryMethodPattern.Rewards.IronFabric;
import FactoryMethodPattern.Rewards.WoodFabric;

public class App {
    public static void main(String[] args) throws Exception {
       ItemGenerator fab1 = new GoldFabric();
       ItemGenerator  fab2 = new DimondFabric();
       ItemGenerator  fab3 = new WoodFabric();
       ItemGenerator  fab4 = new EmeraldFabric();
       ItemGenerator  fab5 = new IronFabric();
       List<ItemGenerator> fabricList = new ArrayList<>();
       fabricList.add(fab1);
       fabricList.add(fab2);
       fabricList.add(fab3);
       fabricList.add(fab4);
       fabricList.add(fab5);
       Random rnd = new Random();
       for (int i = 0; i < 15; i++) {
        int index = rnd.ints(0,5).findFirst().getAsInt();
        fabricList.get(index).openReward();
    }
    }
}
