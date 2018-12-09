package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.hardware.DcMotor
import org.BeehiveRobotics.Library.Util.BROpMode
import org.BeehiveRobotics.Library.Robots.MecanumRobot

@Autonomous(name = " Test MecanumDrive", group = "Test")
class MecanumDriveTest: BROpMode(OpModeType.Autonomous) {
    private val robot = Robot(this)
    override fun initialize() {
        this.robot.init()
    }
    override fun run() {
        dashboard.showLine("Forward full speed 12 inches")
        robot.drive.forward(1.0, 12.0)
        dashboard.showLine("Backward full speed 12 inches")
        robot.drive.backward(1.0, 12.0)
        dashboard.showLine("Strafe Left full speed 12 inches")
        robot.drive.strafeLeft(1.0, 12.0)
        dashboard.showLine("Strafe Right full speed 12 inches")
        robot.drive.strafeRight(1.0, 12.0)
        dashboard.showLine("Spin Left full speed 12 inches")
        robot.drive.spinLeft(1.0, 12.0)
        dashboard.showLine("Spin Right full speed 12 inches")
        robot.drive.spinRight(1.0, 12.0)
        dashboard.showLine("Left Forward full speed 12 inches")
        robot.drive.leftForward(1.0, 12.0)
        dashboard.showLine("Left Backward full speed 12 inches")
        robot.drive.leftBackward(1.0, 12.0)
        dashboard.showLine("Right Forward full speed 12 inches")
        robot.drive.rightForward(1.0, 12.0)
        dashboard.showLine("Right Backward full speed 12 inches")
        robot.drive.rightBackward(1.0, 12.0)
        dashboard.showLine("Forward Left full speed 12 inches")
        robot.drive.forwardLeft(1.0, 12.0)
        dashboard.showLine("Forward Right full speed 12 inches")
        robot.drive.forwardRight(1.0, 12.0)
        dashboard.showLine("Backward Left full speed 12 inches")
        robot.drive.backwardLeft(1.0, 12.0)
        dashboard.showLine("Backward Right full speed 12 inches")
        robot.drive.backwardRight(1.0, 12.0)

        dashboard.showLine("Forward half speed 12 inches")
        robot.drive.forward(0.5, 12.0)
        dashboard.showLine("Backward half speed 12 inches")
        robot.drive.backward(0.5, 12.0)
        dashboard.showLine("Strafe Left half speed 12 inches")
        robot.drive.strafeLeft(0.5, 12.0)
        dashboard.showLine("Strafe Right half speed 12 inches")
        robot.drive.strafeRight(0.5, 12.0)
        dashboard.showLine("Spin Left half speed 12 inches")
        robot.drive.spinLeft(0.5, 12.0)
        dashboard.showLine("Spin Right half speed 12 inches")
        robot.drive.spinRight(0.5, 12.0)
        dashboard.showLine("Left Forward half speed 12 inches")
        robot.drive.leftForward(0.5, 12.0)
        dashboard.showLine("Left Backward half speed 12 inches")
        robot.drive.leftBackward(0.5, 12.0)
        dashboard.showLine("Right Forward half speed 12 inches")
        robot.drive.rightForward(0.5, 12.0)
        dashboard.showLine("Right Backward half speed 12 inches")
        robot.drive.rightBackward(0.5, 12.0)
        dashboard.showLine("Forward Left half speed 12 inches")
        robot.drive.forwardLeft(0.5, 12.0)
        dashboard.showLine("Forward Right half speed 12 inches")
        robot.drive.forwardRight(0.5, 12.0)
        dashboard.showLine("Backward Left half speed 12 inches")
        robot.drive.backwardLeft(0.5, 12.0)
        dashboard.showLine("Backward Right half speed 12 inches")
        robot.drive.backwardRight(0.5, 12.0)


        dashboard.showLine("Forward full speed 6 inches")
        robot.drive.forward(1.0, 6.0)
        dashboard.showLine("Backward full speed 6 inches")
        robot.drive.backward(1.0, 6.0)
        dashboard.showLine("Strafe Left full speed 6 inches")
        robot.drive.strafeLeft(1.0, 6.0)
        dashboard.showLine("Strafe Right full speed 6 inches")
        robot.drive.strafeRight(1.0, 6.0)
        dashboard.showLine("Spin Left full speed 6 inches")
        robot.drive.spinLeft(1.0, 6.0)
        dashboard.showLine("Spin Right full speed 6 inches")
        robot.drive.spinRight(1.0, 6.0)
        dashboard.showLine("Left Forward full speed 6 inches")
        robot.drive.leftForward(1.0, 6.0)
        dashboard.showLine("Left Backward full speed 6 inches")
        robot.drive.leftBackward(1.0, 6.0)
        dashboard.showLine("Right Forward full speed 6 inches")
        robot.drive.rightForward(1.0, 6.0)
        dashboard.showLine("Right Backward full speed 6 inches")
        robot.drive.rightBackward(1.0, 6.0)
        dashboard.showLine("Forward Left full speed 6 inches")
        robot.drive.forwardLeft(1.0, 6.0)
        dashboard.showLine("Forward Right full speed 6 inches")
        robot.drive.forwardRight(1.0, 6.0)
        dashboard.showLine("Backward Left full speed 6 inches")
        robot.drive.backwardLeft(1.0, 6.0)
        dashboard.showLine("Backward Right full speed 6 inches")
        robot.drive.backwardRight(1.0, 6.0)

    }
}
