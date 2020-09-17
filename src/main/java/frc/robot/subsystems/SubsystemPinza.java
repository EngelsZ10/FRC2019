/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.commands.PinzaCommand;

public class SubsystemPinza extends Subsystem {
  // Pu methods for controlling this subsystem
  // here. Call these from Commands.
  DoubleSolenoid Pinza = new DoubleSolenoid(6,7);

  @Override
  public void initDefaultCommand() {
    //Set the default command for a subsystem here.p
     setDefaultCommand(new PinzaCommand());
  }

  public void AbrirCerrar(boolean Activador){
      if (Activador){
        Pinza.set(DoubleSolenoid.Value.kForward);
      }else{
        Pinza.set(DoubleSolenoid.Value.kReverse);
      }
  }




}
