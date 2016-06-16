/**
 * Copyright 2013 Mark Browning, StellaArtois
 * Licensed under the LGPL 3.0 or later (See LICENSE.md for details)
 */
package com.mtbs3d.minecrift.api;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import de.fruitfly.ovr.enums.EyeType;

public interface IBasePlugin {

	float PIOVER180 = (float)(Math.PI/180);

    public static final int EVENT_CALIBRATION_SET_ORIGIN = 0;
    public static final int EVENT_SET_ORIGIN = 1;
    public static final int EVENT_CALIBRATION_ABORT = 2;

	/**
	 * Plugin ID: should be fixed per plugin! Used in optionsvr.txt
	 */
	public String getID();

	/**
	 * Printable name
	 */
	public String getName();

	public String getInitializationStatus();

	public String getVersion();

	public boolean init() throws Exception;

	public boolean isInitialized();

	public void poll(long frameIndex) throws Exception;

	public void destroy();

    public void beginFrame();

    public void beginFrame(long frameIndex);

    public boolean endFrame();
    
    public boolean endFrame(EyeType eye);
}