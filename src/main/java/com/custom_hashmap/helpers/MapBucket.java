package com.custom_hashmap.helpers;

public class MapBucket {
    Object key;
    Object value;

    public MapBucket(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key +
                "-- " + value;
    }
}
