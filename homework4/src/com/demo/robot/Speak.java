package com.demo.robot;

public class Speak extends Decorator {

    public Speak() {
    }

    public Speak(Robot robot) {
        super(robot);
    }

    @Override
    public void clean() {
        speak();
        robot.clean();
    }

    public void speak(){
        System.out.println("主人，我开始工作了哦！");
    }
}
