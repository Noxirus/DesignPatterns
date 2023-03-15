package Structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type){
            if(!icons.containsKey(type)){
                var icon = new PointIcon(type, null);
                icons.put(type, icon);
            }

            return icons.get(type);
    }
}

//We can store points in a hashmap here
//When we need to reference one we can create it and assign it to the map
//Therefore we do not need to create unnecessary amounts of object and only create them when needed
