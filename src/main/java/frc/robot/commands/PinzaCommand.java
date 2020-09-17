/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.SubsystemPinza;

public class PinzaCommand extends Command {
  boolean activar= false;
  boolean desactivar = false;
  public PinzaCommand() {

    // Use requires() here to declare subsystem dependencies
    requires(Robot.pistonPinza);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.oi.GetB()){
      if(!desactivar){
          activar = !activar;
          desactivar = true;
      }
    }else{
      desactivar = false;
    }

    if(activar){
      Robot.pistonPinza.AbrirCerrar(activar);
    }else {
      Robot.pistonPinza.AbrirCerrar(desactivar);
    }



  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
