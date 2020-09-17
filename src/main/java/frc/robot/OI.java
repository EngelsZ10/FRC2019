/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
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

  public Joystick stick = new Joystick(RobotMap.joystickPort);

  
  public static final String GetLJY = null;

  private boolean a,b,x,y,LB,RB,back,start,LP,RP;
    private double LJX,LJY,LT,RT,RJX,RJY;                
    private  int pov;                                     

   
    
    private Joystick control;

     {
        control = new Joystick(0);
    }

    /*
    *Metodos que regresan valores de los botones booleanos del control
    */
    public boolean GetA(){
        a = control.getRawButton(0);
        return  a;
        
    }
    public boolean GetB(){
		b = control.getRawButton(2);	
        return b;
    }
    public boolean GetX(){
		x = control.getRawButton(3);		
        return x;
    }
    public Boolean GetY(){
	    y = control.getRawButton(4);
        return y;
    }
    public Boolean GetLB(){
		LB = control.getRawButton(5);
        return LB;
    }
    public Boolean GetRB(){
		RB= control.getRawButton(6);
        return RB;
        
    }
    public Boolean GetBack(){
		back= control.getRawButton(7);
        return back;
    }
    public Boolean GetStart(){
		start = control.getRawButton(8);
        return start;
    }
    public Boolean GetLP(){
		LP = control.getRawButton(9);
        return LP;
    }
    public Boolean GetRP(){
        RP = control.getRawButton(10);
        return RP;
    }
    /*
    *Metodos que regresan valores double de los gatillos o palancas
    */
    public Double GetLJX(){
        LJX = control.getRawAxis(0);
        return LJX;
    }
    public Double GetLJY(){
        LJY = control.getRawAxis(1);
        return LJY;
    }
    public Double GetLT(){
        LT = control.getRawAxis(2);
        return LT;
    }
    public Double GetRT(){
        RT = control.getRawAxis(3);
        return RT;
    }
    public Double GetRJX(){
        RJX = control.getRawAxis(4);
        return RJX;
    }
    public Double GetRJY(){
        RJY = control.getRawAxis(5);
        return RJY;  
    }
    /*
    *Metodo que regresa el valor entero de la cruz
    */
    public int GetPOV(){
		pov = control.getPOV();
        return pov;
    }
  //Button Abutton = new JoystickButton(stick, 0);

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
