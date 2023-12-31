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
 * DDBEntry.java
 *
 * Who   Date       Description
 * ====  =========  =================================================================
 * WY    24Jul2015  initial creation
 */

package pixy.meta.adobe;




import pixy.io.ReadStrategy;
import pixy.meta.MetadataEntry;
import pixy.string.StringUtils;

//Building block for DDB
public class DDBEntry {
	private int type;
	private int size;
	protected byte[] data;
	protected ReadStrategy readStrategy;
	
	// Obtain a logger instance
//	private static final Logger LOGGER = LoggerFactory.getLogger(DDBEntry.class);

	public DDBEntry(DataBlockType etype, int size, byte[] data, ReadStrategy readStrategy) {
		this(etype.getValue(), size, data, readStrategy);
	}
	
	public DDBEntry(int type, int size, byte[] data, ReadStrategy readStrategy) {
		this.type = type;
		if(size < 0) throw new IllegalArgumentException("Input size is negative");
		this.size = size;
		this.data = data;
		if(readStrategy == null) throw new IllegalArgumentException("Input readStrategy is null");
		this.readStrategy = readStrategy;
	}

	public void print() {
		DataBlockType etype = getTypeEnum();
		if(etype != DataBlockType.UNKNOWN) {
//			Log.i("Type: {} ({})"+etype, etype.getDescription());
		}
		else {
//			Log.i("Type: Unknown ", Integer.toHexString(type));
		}
//		Log.i("Size: {}", size+"");
	}
	
	public int getType() {
		return type;
	}
	
	public DataBlockType getTypeEnum() {
		return DataBlockType.fromInt(type);
	}
	
	protected MetadataEntry getMetadataEntry() {
		//	
		DataBlockType eType  = DataBlockType.fromInt(type);
		
		if (eType == DataBlockType.UNKNOWN) {
			return new MetadataEntry("UNKNOWN [" + StringUtils.intToHexStringMM(type) + "]:", eType.getDescription());
		} else {
			return new MetadataEntry("" + eType, eType.getDescription());
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public byte[] getData() {
		return data.clone();
	}
}
