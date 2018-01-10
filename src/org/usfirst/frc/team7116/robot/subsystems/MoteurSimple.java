/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7116.robot.subsystems;

import org.usfirst.frc.team7116.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class MoteurSimple extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private Spark s;
	
	public MoteurSimple() {
		super();
		s = new Spark(RobotMap.pwmMoteur);
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	public void setVitesse(float v) {
		s.set(v);
	}
	
	public void arreter() {
		s.stopMotor();
	}
}
