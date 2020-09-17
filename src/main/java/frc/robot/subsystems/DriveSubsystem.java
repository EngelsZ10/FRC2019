/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  //Spark LeftWheel = new Spark(3);
  //Spark RightWheel = new Spark(4);

  DigitalInput LimitSwitch = new DigitalInput(5); 

   DifferentialDrive drive = new DifferentialDrive(new Spark(1), new Spark(2));

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveManuallyCommand());
  }
  
  public void manualDrive(Double move, Double turn){
    LimitSwitch.get();
    
    if(LimitSwitch.get()){
      drive.arcadeDrive(move, turn);
      if (move < -0.3 && move >= -1){
        move = -0.3;
     }
      else if (move > 0.3 && move <= 1){
        move = 0.3;
      }
    
     if (turn < -0.3 && turn >= -1){
        turn = -0.3;
      }
      else if (turn > 0.3 && turn <= 1){
        turn = 0.3;
     }
    } 
  }
  double velocidad=.5;
  public void RotarDerecha(boolean activador){
    if (activador){
      drive.tankDrive(velocidad, -velocidad);
    }
    else{
      drive.tankDrive(0, 0);

    }

   }
   public void RotarIzquierda(boolean activador){
    if (activador){
      drive.tankDrive(-velocidad, velocidad);
    } else{
      drive.tankDrive(0, 0);

    }

   }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

 
}
