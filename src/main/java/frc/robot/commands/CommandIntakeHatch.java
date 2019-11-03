package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class CommandIntakeHatch extends Command {
  
  private double speed;
  
  public CommandIntakeHatch(double sp) {
    super(Robot.intakeHatch);
    this.speed = sp;
  }

  protected void initialize() {
  }

  protected void execute() {
      Robot.intakeHatch.intakeHatch(this.speed);
  }

  @Override
	protected boolean isFinished() {
		return false;
	}

  protected void stop(){
    Robot.intakeHatch.stop();
  }

  @Override
	protected void end() {
  }

}