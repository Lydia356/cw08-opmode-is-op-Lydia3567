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
        public void init(){
        back_left = hardwareMap.dcMotor.get("back_left_motor");
        front_left = hardwareMap.dcMotor.get("front_left_motor");
        front_right = hardwareMap.dcMotor.get("front_right_motor");
        back_right = hardwareMap.dcMotor.get("back_right_motor");
        }
        public void loop() {
            telemetry.update();
            if (gamepad1.left_stick_y == 2) {
                forward();
                telemetry.update();
                telemetry.addData("Forward","Moved Forward");
            }


            if (gamepad1.left_stick_y == 1) {
                backward();
                telemetry.update();
                telemetry.addData("Backwards","Moved Backwards");
            }

            if(gamepad1.right_stick_x == 1){
                back_left.setPower(0);
                front_left.setPower(1);
                front_right.setPower(1);
                back_right.setPower(1);
                telemetry.update();
                telemetry.addData("Left","Turning left");
                if (gamepad1.start) {
                    stop();
                    telemetry.update();
                    telemetry.addData("stop","Stopping");
                }
            }

            if(gamepad1.right_stick_x == -1){
                back_left.setPower(1);
                front_left.setPower(1);
                front_right.setPower(1);
                back_right.setPower(0);
                telemetry.addData("Right","Turning right");
                if (gamepad1.start) {
                    stop();
                    telemetry.update();
                    telemetry.addData("stop","Stopping");
                }
            }

            if (gamepad1.start) {
                stop();
                telemetry.update();
                telemetry.addData("stop","Stopping");
            }

        }
    public void forward(){

        back_left.setPower(-1);
        front_left.setPower(-1);
        front_right.setPower(-1);
        back_right.setPower(-1);
    }

    public void backward(){

        back_left.setPower(1);
        front_left.setPower(1);
        front_right.setPower(1);
        front_right.setPower(1);

    }

    public void stop(){

        back_left.setPower(0);
        front_left.setPower(0);
        front_right.setPower(0);
        front_right.setPower(0);

    }
    }



