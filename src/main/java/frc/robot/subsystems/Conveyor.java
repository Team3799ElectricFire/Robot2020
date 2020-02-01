/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Conveyor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Components of the subsystem declared for 5 motors and pneumatic and the sensors
  TalonSRX Motor1 = new TalonSRX(RobotMap.ConveyorMotor1);
  TalonSRX Motor2 = new TalonSRX(RobotMap.ConveyorMotor2);
  TalonSRX Motor3 = new TalonSRX(RobotMap.ConveyorMotor3);
  TalonSRX Motor4 = new TalonSRX(RobotMap.ConveyorMotor4);
  TalonSRX Motor5 = new TalonSRX(RobotMap.ConveyorMotor5);
  Solenoid Wrist = new Solenoid(RobotMap.PnuematicModule1, RobotMap.WristModule2);
  DigitalInput BallSensor1 = new DigitalInput(RobotMap.BallSensor1);
  DigitalInput BallSensor2 = new DigitalInput(RobotMap.BallSensor2);
  DigitalInput BallSensor3 = new DigitalInput(RobotMap.BallSensor3);
  DigitalInput BallSensor4 = new DigitalInput(RobotMap.BallSensor4);
  DigitalInput BallSensor5 = new DigitalInput(RobotMap.BallSensor5);


  public Conveyor() {
    super();

    //Reset Talons to default
    Motor1.configFactoryDefault();
    Motor2.configFactoryDefault();
    Motor3.configFactoryDefault();
    Motor4.configFactoryDefault();
    Motor5.configFactoryDefault();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  // This is for deciding whether or not to run the motors which navigate the balls elegantly throughout the conveyor belt.
  public void BallDecision(TalonSRX motor, Boolean Before, Boolean Inside, Boolean After) {
    if ((Before && !Inside) || (Before && !After)) {
      motor.set(ControlMode.PercentOutput, 1.0);
    } else { 
      motor.set(ControlMode.PercentOutput, 0.0);
    }
  }


  //wrist tingz :P
  public void RaiseWrist() {
    Wrist.set(false);
  }

  public void LowerWrist(){
    Wrist.set(true);
  }

}
