package com.stzteam.features.posefinder;

import com.ctre.phoenix6.swerve.SwerveRequest;
import com.ctre.phoenix6.swerve.SwerveDrivetrain.SwerveDriveState;

import edu.wpi.first.wpilibj2.command.Subsystem;

public interface ICommandSwerveDrivetrain {

    SwerveDriveState getState();

    void setControl(SwerveRequest request);

    Subsystem asSubsystem();
    
}
