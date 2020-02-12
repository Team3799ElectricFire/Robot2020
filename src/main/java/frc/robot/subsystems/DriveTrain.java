/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;


 /*I put gyro and field centric stuff 
  in here as comments bc
  I was unsure if we desired and/or 
  required it this year. -Caroline
  */

//import frc.robot.commands.Drive_TwoStickArcade;
//import com.kauailabs.navx.frc.AHRS;


/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private TalonSRX rightFrontMotor = new TalonSRX(3);
  //CANBus 3
  private TalonSRX rightRearMotor = new TalonSRX(2);
  //CANBus 2

  private TalonSRX leftFrontMotor = new TalonSRX(13);
  //CANBus 13
  private TalonSRX leftRearMotor = new TalonSRX(14);
  //CANBus 14

 
  //private AHRS gyro;

  //constructor makes the rear motors follow the front
  public DriveTrain(){
  super();

    rightFrontMotor.setInverted(true);
    rightRearMotor.follow(rightFrontMotor);
    rightRearMotor.setInverted(InvertType.FollowMaster);
    
    leftRearMotor.follow(leftFrontMotor);
    leftRearMotor.setInverted(InvertType.FollowMaster);

   /*try {
      gyro = new AHRS(SPI.Port.kMXP); 
   } catch (RuntimeException ex ) {
       System.out.println("Error instantiating navX-MXP:  " + ex.getMessage());
   } */
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  
    // setDefaultCommand(new Drive_TwoStickArcade());
  }

  public void TankDrive(double leftSpd, double rightSpd){
    leftFrontMotor.set(ControlMode.PercentOutput, leftSpd);
    rightFrontMotor.set(ControlMode.PercentOutput, rightSpd);
  }

  public void ArcadeDrive(double fwdSpd, double strafeSpd){
    double leftSpd = fwdSpd + strafeSpd;
    double rightSpd = fwdSpd - strafeSpd;

    leftFrontMotor.set(ControlMode.PercentOutput, leftSpd);
    rightFrontMotor.set(ControlMode.PercentOutput, rightSpd);
  }

  /* 
  public void FieldOrientedArcadeDrive(double fwdSpd, double strafeSpd, double turnSpd) {
    double angle = -Math.toRadians(gyro.getYaw());

    double rotFwdSpd = fwdSpd*Math.cos(angle) + strafeSpd*Math.sin(angle);
    double rotStrafeSpd = strafeSpd*Math.cos(angle) - fwdSpd*Math.sin(angle);

    this.ArcadeDrive(rotFwdSpd*0.25, rotStrafeSpd*0.25 - turnSpd*0.50);
  }

  public double getGyro(){
    return gyro.getYaw();
  }

  public void resetGyro(){
    gyro.zeroYaw();
  }
  */









}
