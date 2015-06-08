package com.gufengyy.learn.guava.eventbus;

import com.google.common.eventbus.EventBus;

public class TestEventBus {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus("cache");
        CollEventListener listener = new CollEventListener();
        eventbus.register(listener);
        
        eventbus.post(new CacheEvent(1, "coll"));
        eventbus.post(new CacheEvent(2, "coll"));
        eventbus.post(new CacheEvent(3, "video"));
    }
}
