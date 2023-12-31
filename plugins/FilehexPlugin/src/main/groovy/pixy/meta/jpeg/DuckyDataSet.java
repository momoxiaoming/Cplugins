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
 * DuckyDataSet.java
 *
 * Who   Date       Description
 * ====  =======    ============================================================
 * WY    02Jul2015  Initial creation
 */

package pixy.meta.jpeg;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import pixy.io.IOUtils;
import pixy.meta.MetadataEntry;
import pixy.util.ArrayUtils;

public class DuckyDataSet {
	private int tag;
	private int size;
	private byte[] data;
	private int offset;
	
	// Obtain a logger instance
//	private static final Logger LOGGER = LoggerFactory.getLogger(DuckyDataSet.class);
	
	public DuckyDataSet(int tag, byte[] data) {
		this(tag, data.length, data, 0);
	}
	
	public DuckyDataSet(int tag, int size, byte[] data, int offset) {
		this.tag = tag;
		this.size = size;
		this.data = data;
		this.offset = offset;
	}
	
	public byte[] getData() {
		return ArrayUtils.subArray(data, offset, size);
	}
	
	public MetadataEntry getMetadataEntry() {
		//
		MetadataEntry entry = null;
		
		if(size < 4) {
//			LOGGER.warn("Data set size {} is too small, should >= 4", size);
			return new MetadataEntry("Bad Ducky DataSet", "Data set size " + size + " is two small, should >= 4");
		}
			
		DuckyTag etag = DuckyTag.fromTag(tag);
		
		if(etag == DuckyTag.UNKNOWN) {
			entry = new MetadataEntry("Unknown tag", tag + "");
		} else if(etag == DuckyTag.QUALITY) {
			entry = new MetadataEntry(etag.getName(), IOUtils.readUnsignedIntMM(data, offset) + "");
		} else {
			String value = "";
			try {
				// We need to skip 4 unknown bytes for each string entry!!!
				value = new String(data, offset + 4, size - 4, "UTF-16BE");
			} catch (UnsupportedEncodingException e) {
//				LOGGER.error("UnsupportedEncoding \"UTF-16BE\"");
			}
			entry = new MetadataEntry(etag.getName(), value);
		}
		
		return entry;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getTag() {
		return tag;
	}
	
	public void print() {
		if(size < 4) {
//			LOGGER.warn("Data set size {} is too small, should >= 4", size);
			return;
		}
			
		DuckyTag etag = DuckyTag.fromTag(tag);
		
		if(etag == DuckyTag.UNKNOWN) {
//			Log.i("Unknown tag: {}", tag);
		} else if(etag == DuckyTag.QUALITY) {
//			Log.i(etag + ": {}", IOUtils.readUnsignedIntMM(data, offset));
		} else {
			String value = "";
			try {
				// We need to skip 4 unknown bytes for each string entry!!!
				value = new String(data, offset + 4, size - 4, "UTF-16BE");
			} catch (UnsupportedEncodingException e) {
//				LOGGER.error("UnsupportedEncoding \"UTF-16BE\"");
			}
//			Log.i(etag + ": {}", value);
		}
	}
	
	public void write(OutputStream out) throws IOException {
		IOUtils.writeShortMM(out, tag);
		IOUtils.writeShortMM(out, size);
		out.write(data, offset, size);
	}
}
