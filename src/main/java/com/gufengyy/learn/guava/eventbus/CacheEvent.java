package com.gufengyy.learn.guava.eventbus;

public class CacheEvent {
    private int id;
    private String command;

    public CacheEvent(int id, String command) {
        super();
        this.id = id;
        this.command = command;
    }

    public int getId() {
        return id;
    }

    public String getCommand() {
        return command;
    }

}
