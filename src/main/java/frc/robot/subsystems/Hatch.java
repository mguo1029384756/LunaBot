/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.RobotMap;
import frc.robot.commands.HatchRetract;
import frc.robot.commands.HatchExtend;

/**
 * Add your docs here.
 */
public class Hatch extends Subsystem {
  DoubleSolenoid Hatch = new DoubleSolenoid(RobotMap.FIRST_SOLENOID_PORT, RobotMap.FIRST_SOLENOID_PORT);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
      setDefaultCommand(new HatchExtend());
      setDefaultCommand(new HatchRetract());
  }
  
  public void extendHatch() {
    Hatch.set(DoubleSolenoid.Value.kForward);
  }

  public void retractHatch() {
    Hatch.set(DoubleSolenoid.Value.kReverse);
  }

  public void turnOffHatch() {
    Hatch.set(DoubleSolenoid.Value.kOff);
  }
}
