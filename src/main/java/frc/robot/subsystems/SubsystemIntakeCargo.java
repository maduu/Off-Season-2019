package frc.robot.subsystems; 

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;
import static frc.robot.RobotMap.*;

public class SubsystemIntakeCargo extends Subsystem {
  private static VictorSP intakeCargo = new VictorSP(INTAKE_CARGO_ID);
  
  public SubsystemIntakeCargo(){
    super();
  } 

	public void intakeCargo(double speed){
		intakeCargo.set(speed);
	}

  public void stop(){
    intakeCargo.set(0);
  }

  @Override
  public void initDefaultCommand() {
  }
  
}