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
public class Yeeter extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  TalonSRX Yeet1 = new TalonSRX(RobotMap.Yeet1);
  TalonSRX Yeet2 = new TalonSRX(RobotMap.Yeet2);

  public Yeeter() {
    super();
    Yeet1.configFactoryDefault();
    Yeet2.configFactoryDefault();
    Yeet2.follow(Yeet1);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void Thrower(double YeetSpeed){
    Yeet1.set(ControlMode.PercentOutput, YeetSpeed);
  }





}
