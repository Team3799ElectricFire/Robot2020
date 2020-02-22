/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TurnToTarget extends Command {
  NetworkTable Limelit = NetworkTableInstance.getDefault().getTable("limelight");
  NetworkTableEntry tx = Limelit.getEntry("tx");
  double targetAngle, p_gain = 0.3, thresh = 10;

  public TurnToTarget() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    targetAngle = tx.getDouble(0.0);
    double turnSpd = p_gain * targetAngle;

    Robot.m_drivetrain.TankDrive(-turnSpd, turnSpd);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return (Math.abs(targetAngle) < thresh);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_drivetrain.TankDrive(0.0, 0.0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
