package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "Controls 01", group = "Honors Robotics")

    public class Controls01 extends OpMode {
    String name;
    String group;
    DcMotor back_left;
    DcMotor front_left;
    DcMotor front_right;
    DcMotor back_right;

    @Override
    public void init() {
        back_left = hardwareMap.dcMotor.get("back_left_motor");
        front_left = hardwareMap.dcMotor.get("front_left_motor");
        front_right = hardwareMap.dcMotor.get("front_right_motor");
        back_right = hardwareMap.dcMotor.get("back_right_motor");
    }

    public void loop() {
        float y = gamepad1.left_stick_y;
        telemetry.addData("Value of left stick y", y);


        float x = gamepad1.right_stick_x;
        telemetry.addData("Value of left stick x", x);

        back_left.setPower(y);
        front_left.setPower(x);
        front_right.setPower(x);
        back_right.setPower(-y);


        if (gamepad1.start) {
            back_left.setPower(0);
            front_left.setPower(0);
            front_right.setPower(0);
            back_right.setPower(0);
            telemetry.update();
            telemetry.addData("stop", "Stopping");
        }

    }
}



