package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import org.BeehiveRobotics.Library.Util.BROpMode
import org.firstinspires.ftc.teamcode.CV.GoldMineralPosition
import com.qualcomm.robotcore.util.ElapsedTime

@Autonomous(name="Crater - Sample Both", group="RR2")
class CraterBothSample(): BROpMode(BROpMode.OpModeType.Autonomous) {
    private val robot = Robot(this)
    override fun initialize() {
        robot.init()
        robot.cv.startCV()
    }
    override fun onStartPressed() {
        robot.start()
    }
    override fun run() {
        robot.land()
        val goldMineralPosition = robot.cv.getGoldMineralPosition()
        robot.cv.stopCV()
        robot.sample(goldMineralPosition)
        when(goldMineralPosition) {
            GoldMineralPosition.LEFT ->   robot.drive.strafeLeft(0.75, 24.0)
            //GoldMineralPosition.CENTER -> robot.drive.strafeLeft(0.75, 50.0)
            GoldMineralPosition.RIGHT ->  robot.drive.strafeLeft(0.75, 64.0)
        }
        robot.drive.spinLeft(0.7, 10.0)
        robot.drive.forward(0.6)
        sleep(500L)
        robot.drive.stopMotors()
        robot.drive.backward(0.8, 1.0)
        robot.waitUntilNotBusy()
        when(goldMineralPosition) {
            GoldMineralPosition.RIGHT -> {
                robot.drive.strafeLeft(0.85, 48.0)
                robot.teamMarker.down()
                robot.drive.spinLeft(1.0, 1.5)
                robot.drive.strafeRight(0.85, 20.0, waitForCompletion = false)
                sleep(500)
                robot.teamMarker.up()
                robot.waitUntilNotBusy()
                robot.drive.backward(0.5, 10.0)
                robot.drive.forward(0.5, 10.0)
                robot.drive.spinRight(1.0, 18.0)
                robot.drive.forward(0.85, 50.0, waitForCompletion = false)
            }
            GoldMineralPosition.CENTER -> {
                robot.drive.strafeLeft(0.85, 55.0)
                robot.teamMarker.down()
                robot.drive.spinLeft(1.0, 1.5)
                robot.drive.strafeRight(0.75, 2.0, waitForCompletion = false)
                sleep(500)
                robot.teamMarker.up()
                robot.drive.backward(0.5, 20.0)
                robot.drive.forward(0.5, 20.0)
                robot.drive.spinRight(1.0, 18.0)
                robot.drive.forward(0.85, 55.0, waitForCompletion = false)
            }
            GoldMineralPosition.LEFT -> {
                robot.drive.strafeLeft(0.85, 60.0)
                robot.teamMarker.down()
                robot.drive.spinLeft(1.0, 1.5)
                robot.drive.strafeRight(0.75, 2.0, waitForCompletion = false)
                sleep(500)
                robot.teamMarker.up()
                robot.drive.backward(0.5, 33.0)
                robot.drive.forward(0.5, 33.0)
                robot.drive.spinRight(1.0, 18.0)
                robot.drive.forward(0.85, 63.0, waitForCompletion = false)
            }
        }
        robot.gathering.inBetween()
        sleep(350)
        robot.gathering.inOutMotor.runForTime(-1.0, 500L)
        robot.gathering.down()
        robot.waitUntilNotBusy()
    }
}