package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Settings;
import frc.robot.subsystems.Roller;


public class OperatorControl extends CommandBase{
    private Roller roller;
    private XboxController controller;

    public OperatorControl(Roller roller){
        addRequirements(roller);
        this.roller = roller;
        controller = new XboxController(Settings.General.OPERATR_CONTROLLER_PORT);
    }

    @Override
    public void execute() {
        if (controller.getRightBumper()) {
            roller.intake();
        } else if (controller.getRightTriggerAxis()>0) {
            roller.outtake(controller.getRightTriggerAxis());
        } else {
            roller.stop();
        }
    }
   



}
