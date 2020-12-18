package com.demo.robot;

public class IsClean extends Decorator{
    private String status;

    public IsClean(String status) {
        this.status = status;
    }

    public IsClean(Robot robot, String status) {
        super(robot);
        this.status = status;
    }

    public boolean judge(String status){

        return status.equals("不干净");
    }

    @Override
    public void clean() {
        if (judge(status)){
            System.out.println("地上很脏，需要打扫");
            robot.clean();
        }else {
            System.out.println("地上干净,无需打扫");
        }
    }
}
