package frc.robot.commands;

import edu.wpi.first.wpilibj.command.*;
import frc.robot.Robot;

public class CommandIntakeCargo extends Command {
  
  private double speed;
  
  public CommandIntakeCargo(double sp) {
    super(Robot.intakeCargo);
    this.speed = sp;
  }
  
  protected void initialize() {
  }
  
  protected void execute(){
			Robot.intakeCargo.intakeCargo(this.speed);
  }

  @Override
	protected boolean isFinished() {
		return false;
	}

  protected void stop(){
    Robot.intakeCargo.stop();
  }
  
  @Override
	protected void end() {
  }
  
}