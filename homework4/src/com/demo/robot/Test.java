package com.demo.robot;

public class Test {
    public static void main(String[] args) {
        String status = "不干净";

        Robot robot = new CleanRobot();

        robot = new Speak(robot);

        robot = new IsClean(robot,status);
        robot.clean();

    }
}
