package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;
import static frc.robot.RobotMap.*;

public class SubsystemIntakeHatch extends Subsystem {
  private static VictorSP intakeHatch = new VictorSP(INTAKE_HATCH_ID);

  public SubsystemIntakeHatch(){
    super();
  } 

  public void intakeHatch(double speed){
    intakeHatch.set(speed);
  }

  public void stop(){
    intakeHatch.set(0);
  }

  @Override
  public void initDefaultCommand() {
  }
  
}