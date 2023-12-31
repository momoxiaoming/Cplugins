/**
 * Copyright (C) 2014-2019 by Wen Yu.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Any modifications to this file must keep this entire header intact.
 *
 * Change History - most recent changes go on top of previous changes
 *
 * UserMask.java - Adobe Photoshop Document Data Block LMsk
 *
 * Who   Date       Description
 * ====  =========  =================================================
 * WY    28Jul2015  Initial creation
 */

package pixy.meta.adobe;


import java.util.Arrays;

import pixy.io.ReadStrategy;

public class UserMask extends DDBEntry {
	private int colorSpaceId;
	private int[] colors = new int[4];
	private int opacity;
	private int flag;
	
	// Obtain a logger instance
//	private static final Logger LOGGER = LoggerFactory.getLogger(UserMask.class);
	
	public UserMask(int size, byte[] data, ReadStrategy readStrategy) {
		super(DataBlockType.LMsk, size, data, readStrategy);
		read();
	}
	
	public int[] getColors() {
		return colors.clone();
	}
	
	public int getOpacity() {
		return opacity;
	}
	
	public int getFlag() {
		return flag;
	}
	
	public int getColorSpace() {
		return colorSpaceId;
	}
	
	public ColorSpaceID getColorSpaceID() {
		return ColorSpaceID.fromInt(colorSpaceId);
	}
	
	public void print() {
		super.print();
//		Log.i("Color space: {}", getColorSpaceID()+"");
//		Log.i("Color values: {}", Arrays.toString(colors));
//		Log.i("Opacity: {}", opacity+"");
//		Log.i("Flag: {}", flag+"");
	}
	
	private void read() {
		int i = 0;
		colorSpaceId = readStrategy.readShort(data, i);
		i += 2;
		colors[0] = readStrategy.readUnsignedShort(data, i);
		i += 2;
		colors[1] = readStrategy.readUnsignedShort(data, i);
		i += 2;
		colors[2] = readStrategy.readUnsignedShort(data, i);
		i += 2;
		colors[3] = readStrategy.readUnsignedShort(data, i);
		i += 2;
		opacity = readStrategy.readShort(data, i);
		i += 2;
		flag = data[i]&0xff; // 128
	}
}
