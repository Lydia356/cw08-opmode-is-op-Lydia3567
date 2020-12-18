package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "Controls 02", group = "Honors Robotics")
public class Controls02 extends OpMode {
    String name;
    String group;
    DcMotor BL;
    DcMotor BR;
    DcMotor FL;
    DcMotor FR;

    @Override
    public void init(){
        BL = hardwareMap.dcMotor.get("BL");
        BR = hardwareMap.dcMotor.get("BR");
        FL = hardwareMap.dcMotor.get("FL");
        FR = hardwareMap.dcMotor.get("FR");
    }
    public void loop() {
        float y= gamepad1.left_stick_y;
        float x= gamepad1.right_stick_x;
        boolean a= gamepad1.a;
        boolean b= gamepad1.b;
        boolean xButton= gamepad1.x;
        boolean yButton= gamepad1.x;

        telemetry.addData("Y=axis postion", y);
        telemetry.addData("x=axis postion", x);
        telemetry.addData("A button is", a);
        telemetry.addData("B button is", b);
        telemetry.addData("X button is", xButton);
        telemetry.addData("Y button is", yButton);

        if(gamepad1.start){
            stop();
        }

    }
    public void stop(){
        BL.setPower(0);
        BR.setPower(0);
        FL.setPower(0);
        FR.setPower(0);
    }

}
