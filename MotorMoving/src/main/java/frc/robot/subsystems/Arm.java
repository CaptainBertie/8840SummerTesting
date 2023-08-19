package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

import frc.team_8840_lib.controllers.specifics.SparkMaxEncoderWrapper;

public class Arm extends SubsystemBase{
    private CANSparkMax shoulderMotor;
    private CANSparkMax elbowMotor;
    
    private SparkMaxEncoderWrapper shoulderEncoder;
    private SparkMaxEncoderWrapper elbowEncoder; 
}
