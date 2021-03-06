package org.firstinspires.ftc.teamcode

import org.BeehiveRobotics.Library.Systems.MecanumDrive
import org.BeehiveRobotics.Library.Util.BROpMode
import org.BeehiveRobotics.Library.Sensors.REVColorSensor
import com.qualcomm.robotcore.util.ElapsedTime
import org.BeehiveRobotics.Library.Motors.Motor

class Drive(opMode: BROpMode): MecanumDrive(opMode, gearRatio = 1.0) {
    override fun init() {
        super.init()
        model = Motor.MotorModel.NEVEREST20
        super.MIN_SPEED = 0.25
        RAMP_CLICKS_PROPORTION = 1.0
        MAX_NO_SLIP_SPEED = 0.4
        if(opMode.opModeType == BROpMode.OpModeType.TeleOp) {
            setRampingTypes(Motor.RampingType.None)
        } else {
            setRampingTypes(Motor.RampingType.Piecewise)
        }
    }
}