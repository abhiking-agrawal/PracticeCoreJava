package com.custom_hashmap.helpers;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CustomHashMap {

    private ArrayList<MapBucket> list;

    public CustomHashMap() {
        this.list = new ArrayList<MapBucket>();
    }

    public void put(Object key, Object value){
        MapBucket temp =new MapBucket(key,value);

        for(MapBucket i : list){
            if(i.getKey().equals(key)){
                //remove the existing object
                list.remove(i);
                break;
            }
        }
        list.add(temp);
    }

    public Object get(Object key){
        for(MapBucket i : list){
            if(i.getKey().equals(key)){
                //remove the existing object
                return i.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return  list.toString();
    }
}
