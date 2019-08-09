/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.Drivetank;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  private CanSparkMax leftSparkMax;
  private CanSparkMax rightSparkMax;
  private DifferentialDrive differentialDrive;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Drivetrain() {
    leftSparkMax = new SparkMax(RobotMap.LEFT_CANSPARKMAX_PORT);
    rightSparkMax = new SparkMax(RobotMap.RIGHT_CANSPARKMAX_PORT);
    differentialDrive = new DifferentialDrive(leftSparkMax, rightSparkMax);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new Drivetank());
  }
    public void drive(double leftSpeed, double rightSpeed) {
      differentialDrive.tankDrive(leftSpeed, rightSpeed);
  }
  }

