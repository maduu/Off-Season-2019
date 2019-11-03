package frc.robot;

import frc.robot.Robot;
import frc.robot.commands.*;
import frc.robot.subsystems.SubsystemJoystick;

public class OI {
    public OI(){
        Robot.joystick.whenHeld(SubsystemJoystick.d_B, new CommandIntakeCargo(0.4));
        Robot.joystick.whenHeld(SubsystemJoystick.d_A, new CommandIntakeCargo(-0.4));
        Robot.joystick.whenHeld(SubsystemJoystick.d_X, new CommandIntakeHatch(-0.4));
        Robot.joystick.whenHeld(SubsystemJoystick.d_Y, new CommandIntakeHatch(0.4));
        
    }
}