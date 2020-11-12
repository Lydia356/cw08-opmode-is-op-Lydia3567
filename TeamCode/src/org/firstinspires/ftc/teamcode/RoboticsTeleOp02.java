package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ftc16072.Util.RobotPosition;


@Autonomous(name = "Robotics Auto 01", group = "Honors Robotics")
    public class RoboticsTeleOp02 extends LinearOpMode {
        public void runOpMode(){
        String name;
        String group;
            if(gamepad1.start) {
                telemetry.addData("Press Start When Ready", "");
                telemetry.update();
            }
        }
    }


