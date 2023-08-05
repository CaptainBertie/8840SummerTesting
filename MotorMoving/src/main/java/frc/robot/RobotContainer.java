package frc.robot;

import frc.robot.commands.OperatorControl;
import frc.robot.subsystems.Roller;

public class RobotContainer {
    private static RobotContainer instance;

        public static RobotContainer getInstance() {
            return instance;
        }

        private Roller roller;

        public RobotContainer() {
            instance = this;

            roller = new Roller();
        
            OperatorControl operatorControl = new OperatorControl(roller);
    
            roller.setDefaultCommand(operatorControl);
        }

}


