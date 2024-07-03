package com.zyg.behavioral.observer;

public class Editor {
    private EventManager eventManager;

    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void openFile() {
        System.out.println("打开文件");
        for (Listener listener : eventManager.getListeners()) {
            listener.response();
        }
    }

    public EventManager getEventManager() {
        return eventManager;
    }
}
