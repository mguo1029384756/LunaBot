/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ballRelease;
import frc.robot.commands.ballIntakeShoot;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;


/**
 * Add your docs here.
 */
public class Cargo extends Subsystem {
  private VictorSPX shooterMotor;
  private VictorSPX intakeMotor;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Cargo() {
    shooterMotor.follow(intakeMotor);
    shooterMotor = new VictorSPX(RobotMap.SHOOTER_VICTOR_PORT);
    intakeMotor = new VictorSPX(RobotMap.INTAKE_VICTOR_PORT);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ballIntakeShoot());
    setDefaultCommand(new ballRelease());
  }
  public void forward() {
    intakeMotor.set(ControlMode.PercentOutput, 1);
  }

  public void reverse() {
    intakeMotor.set(ControlMode.PercentOutput, -1);
  }
}
