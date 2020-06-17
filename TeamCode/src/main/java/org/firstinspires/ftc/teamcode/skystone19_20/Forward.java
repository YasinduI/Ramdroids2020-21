package org.firstinspires.ftc.teamcode.skystone19_20;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Forward", group = "BackUp")


public class Forward extends AutonHardware {

    @Override
    public void runOpMode() {


        startup();
        waitForStart();
        DriveForward(800,800);

        telemetry.addLine("path complete");
        telemetry.update();


    }
}
