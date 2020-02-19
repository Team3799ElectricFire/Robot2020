/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.POVButton;
import frc.robot.commands.LiftArmUp;
import frc.robot.commands.LiftRobotUp;
import frc.robot.commands.Shooty;
import frc.robot.commands.SpinWheelOfWOW;
import frc.robot.subsystems.Climber;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  public Joystick stick = new Joystick(0);
  //Controller with Red Tape on the USB is named, "stick"
  JoystickButton AButton = new JoystickButton(stick, 0);
  JoystickButton BButton = new JoystickButton (stick, 1);
  JoystickButton XButton = new JoystickButton (stick, 2);
  JoystickButton YButton = new JoystickButton (stick, 3);
  JoystickButton LeftBumper = new JoystickButton (stick, 4);
  JoystickButton RightBumper = new JoystickButton (stick, 5);
  JoystickButton BackButton = new JoystickButton (stick, 6);
  JoystickButton StartButton = new JoystickButton (stick, 7);
  JoystickButton LJStickButton = new JoystickButton (stick, 8);
  JoystickButton RJStickButton = new JoystickButton (stick, 9);
// These are the buttons on the controller and their respective values on the Driver's Station

  public final int LeftXAxis = 0;
  public final int LeftYAxis = 1;
  public final int LeftTrigger = 2;
  public final int RightTrigger = 3;
  public final int RightXAxis = 4;
  public final int RightYAxis = 5;

  /* This is our DPad directions. We are only using directly up and down, followed:
  POVButton Name = new POVButton(joystick, angle); */



//Driving function of the sticks of stick
  public double getLeftXAxis(){
    return stick.getRawAxis(0);
  }

  public double getLeftYAxis(){
    return stick.getRawAxis(1);
  }

  public double getLeftTrigger(){
    return stick.getRawAxis(2);
  }

  public double getRightTrigger(){
    return stick.getRawAxis(3);
  }

  public double getRightXAxis(){
    return stick.getRawAxis(4);
  }

  public double getRightYAxis(){
    return stick.getRawAxis(5);
  }




  // Second controller is named "baby"
  public Joystick baby = new Joystick(1);
  POVButton UpDPad = new POVButton(baby, 0);
  POVButton DownDPad = new POVButton(baby, 180);
  JoystickButton ABaby = new JoystickButton(baby, 0);


  public OI() {
  StartButton.whileHeld(new SpinWheelOfWOW());
   

  //This is the second controller buttons for Baby Driver
  UpDPad.whileHeld(new LiftArmUp());
  DownDPad.whileHeld(new LiftRobotUp());
  ABaby.whileHeld(new Shooty());


  }

//These are the values of each joystick when moved along its respective axis as well as the triggers LT and RT

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());


}

