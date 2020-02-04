/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Climber extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  TalonSRX ClimbMotor1 = new TalonSRX(RobotMap.ClimbMotor1);
  TalonSRX ClimbMotor2 = new TalonSRX(RobotMap.ClimbMotor2);
  TalonSRX Scoots1 = new TalonSRX(RobotMap.Scoots1);
  TalonSRX Scoots2 = new TalonSRX(RobotMap.Scoots2);

  public Climber() {
    super();

    ClimbMotor1.configFactoryDefault();
    ClimbMotor2.configFactoryDefault();
    ClimbMotor2.follow(ClimbMotor1);


    Scoots1.configFactoryDefault();
    Scoots2.configFactoryDefault();
    Scoots2.follow(Scoots1);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void VertClimber(double ClimbSpeed) {
    ClimbMotor1.set(ControlMode.PercentOutput, ClimbSpeed);
  }

  public void Scooter(double ScootsSpeed) {
    Scoots1.set(ControlMode.PercentOutput, ScootsSpeed);
  }
}
