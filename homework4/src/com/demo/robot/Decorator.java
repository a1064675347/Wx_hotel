package com.demo.robot;

public abstract class Decorator implements Robot{
    protected Robot robot;

    public Decorator() {
    }

    public Decorator(Robot robot) {
        this.robot = robot;
    }

}
