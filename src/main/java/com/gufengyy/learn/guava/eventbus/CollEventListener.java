package com.gufengyy.learn.guava.eventbus;

import com.google.common.eventbus.Subscribe;

public class CollEventListener {
    private int id;
    
    @Subscribe
    public void listen(CacheEvent event){
        this.id = event.getId();
        System.out.println("Cache:" + id);
    }
    
}
