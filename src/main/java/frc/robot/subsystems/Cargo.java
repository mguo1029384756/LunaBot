/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import frc.robot.RobotMap;
/**
 * Add your docs here.
 */
public class Cargo extends Subsystem {

  private Victor cargoShooter;
  private Victor cargoIntake;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Cargo() {
    cargoShooter = new Victor(RobotMap.SHOOTER_VICTOR_PORT);
    cargoIntake = new Victor(RobotMap.INTAKE_VICTOR_PORT);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
