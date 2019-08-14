/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class ballRelease extends InstantCommand {
  /**
   * Add your docs here.
   */
  public ballRelease() {
    super();
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_Cargo);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    Robot.m_Cargo.reverse();
  }

}