/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;


/**
 * Add your docs here.
 */

 //Hedgehog is the gearshift
public class Hedgehog extends Subsystem {
 
  private DoubleSolenoid s_gearshift;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public Hedgehog(){
    s_gearshift = new DoubleSolenoid(RobotMap.PnuematicModule1, RobotMap.HedgehogForward, RobotMap.HedgehogBackward);
  }

  public void Hedgehog_Off(){
    s_gearshift.set(Value.kOff);
  }

  public void setForward(){
    s_gearshift.set(Value.kForward);
  }

  public void setReverse(){
    s_gearshift.set(Value.kReverse);
  }

  public void Toggle(){
    if (s_gearshift.get() != Value.kForward){
      s_gearshift.set(Value.kForward);
    }
    else{
      s_gearshift.set(Value.kReverse);
    }
  }




}
