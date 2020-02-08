/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.ColorSensorV3;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.util.Color;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class WheelOfFortune extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  TalonSRX Motor1 = new TalonSRX(RobotMap.WheelMotor1);
  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  ColorSensorV3 sensor = new ColorSensorV3(i2cPort);

  public WheelOfFortune() {
    super();

    Motor1.configFactoryDefault();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  
  public void SpinWheel(double WheelSpeed) {
    Motor1.set(ControlMode.PercentOutput, WheelSpeed);
  }

  // Color detectedColor = m_colorSensor.getColor();


  //// TODO help finish this please future billy/caroline/emmalie/dave this needs to be the right version aaaaaa
}
