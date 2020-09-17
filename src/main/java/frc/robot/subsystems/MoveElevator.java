/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import frc.robot.commands.Move;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * Add your docs here.
 */
public class MoveElevator extends Subsystem {

  public Spark Elevador = new Spark(8);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Move());
  }

  public void subir(double speed){
    if(speed >=.1 ){
      Elevador.set(speed*.5);
    }
    else{
      Elevador.set(0);
    }
  }
    public void bajar(double speed){
      if(speed >=.1 ){
        Elevador.set(-speed*.5);
      }
      else{
        Elevador.set(0);
      }

  }






}
