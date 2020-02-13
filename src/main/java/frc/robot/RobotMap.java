/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  
  // CANbus address
  public static int ConveyorMotor1 = 1;
  public static int ConveyorMotor2 = 2;
  public static int ConveyorMotor3 = 3;
  public static int ConveyorMotor4 = 4;
  public static int ConveyorMotor5 = 5;
  
  public static int PnuematicModule1 = 6;
  public static int PneumaticModule2 = 20;

  public static int ClimbMotor1 = 7;
  public static int ClimbMotor2 = 8;
  public static int Scoots1 = 9;
  public static int Scoots2 = 10;

  public static int Yeet1 = 11;
  public static int Yeet2 = 12;

  //According to Emmalie, these are where each drive train motor lives
  public static int DriveMotor1 = 13; //right rear
  public static int DriveMotor2 = 14; //right front
  public static int DriveMotor3 = 15; // left rear
  public static int DriveMotor4 = 16; //left front
 
  public static final int WheelMotor1 = 17;


  // Pneumatic Module
  public static int WristModule2 = 1;


  // Digital Inputs
  public static int BallSensor1 = 0;
  public static int BallSensor2 = 1;
  public static int BallSensor3 = 2;
  public static int BallSensor4 = 3;
  public static int BallSensor5 = 4;

  public static int HedgehogForward = 1;
  public static int HedgehogBackward = 2;

}
