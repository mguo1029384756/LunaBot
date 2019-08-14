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
import com.revrobotics.CANSparkMax;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  private CANSparkMax leftSparkMax;
  private CANSparkMax rightSparkMax;
  private DifferentialDrive differentialDrive;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Drivetrain() {
    leftSparkMax = new CANSparkMax(RobotMap.LEFT_CANSPARKMAX_PORT, CANSparkMax.MotorType.kBrushless);
    rightSparkMax = new CANSparkMax(RobotMap.RIGHT_CANSPARKMAX_PORT, CANSparkMax.MotorType.kBrushless);
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
