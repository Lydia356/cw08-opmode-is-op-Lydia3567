package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Robotics TeleOp 01", group = "Honors Robotics")
public class RoboticsTeleOp01 extends OpMode {
    String name;
    String group;
    @Override
    public void loop(){
    }
    public void init(){
        if(gamepad1.start) {
            telemetry.addData("Press Start When Ready", "");
            telemetry.update();
        }
        if(gamepad1.x) {
            telemetry.addData("x pressed", "");
            telemetry.update();
        }
        if(gamepad1.y) {
            telemetry.addData("y pressed", "");
            telemetry.update();
        }
        if(gamepad1.a) {
            telemetry.addData("a pressed", "");
            telemetry.update();
        }
        if(gamepad1.b) {
            telemetry.addData("b pressed", "");
            telemetry.update();
        }
        if(gamepad1.left_stick_button) {
            telemetry.addData("left stick button pressed", "");
            telemetry.update();
        }
        if(gamepad1.right_stick_button) {
            telemetry.addData("right stick button", "");
            telemetry.update();
        }
        if(gamepad1.left_bumper) {
            telemetry.addData("left bumper pressed", "");
            telemetry.update();
        }
        if(gamepad1.right_bumper) {
            telemetry.addData("right bumper pressed", "");
            telemetry.update();
        }
        if(gamepad1.left_trigger>= 1) {
            telemetry.addData("left trigger pressed up", "");
            telemetry.update();
        }
        if(gamepad1.left_trigger < 0) {
            telemetry.addData("left trigger pressed down", "");
            telemetry.update();
        }
        if(gamepad1.right_trigger >= 1) {
            telemetry.addData("right trigger pressed up", "");
            telemetry.update();
        }
        if(gamepad1.right_trigger < 1) {
            telemetry.addData("right trigger pressed down", "");
            telemetry.update();
        }
    }
}
