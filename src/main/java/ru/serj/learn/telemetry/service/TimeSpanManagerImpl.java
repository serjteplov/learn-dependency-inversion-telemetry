package ru.serj.learn.telemetry.service;

import ru.serj.learn.application.service.TimeSpanManager;

public class TimeSpanManagerImpl implements TimeSpanManager {
    public void startTimeSpan(String name) {
        //реализация старта временного отрезка
        System.out.println("Module telemetry. Time span starts for " + name);
    }

    public boolean isActive() {
        //реализация, определяющая, что есть промежуток времени, для которого ведется отсчет времени
        System.out.println("Module telemetry. Time span active?");
        return true;
    }

    public void stopTimeSpan() {
        //реализация завершения временного отрезка
        System.out.println("Module telemetry. Time span stopped");
    }
}
