package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Settings;

public class Roller extends SubsystemBase{
        private CANSparkMax rollerMotor;
        


public Roller(){
    // This is assuming that it is a NEO 500 that is brushless remeber this
    rollerMotor = new CANSparkMax(Settings.Roller.ROLLER_MOTOR_ID, MotorType.kBrushless);

    rollerMotor.restoreFactoryDefaults();

    rollerMotor.setSmartCurrentLimit(25);
    rollerMotor.setSecondaryCurrentLimit(30);

    rollerMotor.setOpenLoopRampRate(0.2);

    rollerMotor.setIdleMode(IdleMode.kBrake);

    rollerMotor.setCANTimeout(20);

    rollerMotor.burnFlash();

}

public void intake(){
    rollerMotor.set(Settings.Roller.INTAKE_SPEED);
}

public void outtake(boolean fast){
    if (fast) {
        rollerMotor.set(Settings.Roller.FAST_OUTTAKE_SPEED);
    } else {
        rollerMotor.set(Settings.Roller.SLOW_OUTTAKE_SPEED);
    }
}

public void stop(){
    rollerMotor.set(0);
}
}
