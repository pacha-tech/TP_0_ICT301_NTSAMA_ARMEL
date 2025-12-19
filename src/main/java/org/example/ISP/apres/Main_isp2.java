package org.example.ISP.apres;

public class Main_isp2 {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();
        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}
