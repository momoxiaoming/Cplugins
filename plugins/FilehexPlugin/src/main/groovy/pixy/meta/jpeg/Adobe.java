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
 * Adobe.java
 *
 * Who   Date       Description
 * ====  =======    ============================================================
 * WY    02Jul2015  Initial creation
 */

package pixy.meta.jpeg;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import pixy.io.IOUtils;
import pixy.meta.Metadata;
import pixy.meta.MetadataEntry;
import pixy.meta.MetadataType;
import pixy.string.StringUtils;

public class Adobe extends Metadata {

	private int m_DCTEncodeVersion;
	private int m_APP14Flags0;
	private int m_APP14Flags1;
	private int m_ColorTransform;
	
	public Adobe(byte[] data) {
		super(MetadataType.JPG_ADOBE, data);
		ensureDataRead();
	}
	
	public Adobe(int dctEncodeVersion, int app14Flags0, int app14Flags1, int colorTransform) {
		super(MetadataType.JPG_ADOBE);
		this.m_DCTEncodeVersion = dctEncodeVersion;
		this.m_APP14Flags0 = app14Flags0;
		this.m_APP14Flags1 = app14Flags1;
		this.m_ColorTransform = colorTransform;
		isDataRead = true;
	}
	
	public int getAPP14Flags0() {
		return m_APP14Flags0;
	}
	
	public int getAPP14Flags1() {
		return m_APP14Flags1;
	}
	
	public int getColorTransform() {
		return m_ColorTransform;
	}
	
	public int getDCTEncodeVersion() {
		return m_DCTEncodeVersion;
	}
	
	public void read() throws IOException {
		if(!isDataRead) {
			int expectedLen = 7;
			int offset = 0;
			
			if (data.length >= expectedLen) {
				m_DCTEncodeVersion = IOUtils.readUnsignedShortMM(data, offset);
				offset += 2;
				m_APP14Flags0 = IOUtils.readUnsignedShortMM(data, offset);
				offset += 2;
				m_APP14Flags1 = IOUtils.readUnsignedShortMM(data, offset);
				offset += 2;
				m_ColorTransform = data[offset]&0xff;			
			}
			
		    isDataRead = true;
		}
	}

	public Iterator<MetadataEntry> iterator() {
		ensureDataRead();
		
		List<MetadataEntry> entries = new ArrayList<MetadataEntry>();
		String[] colorTransform = {"Unknown (RGB or CMYK)", "YCbCr", "YCCK"};
		entries.add(new MetadataEntry("DCTEncodeVersion", m_DCTEncodeVersion + ""));
		entries.add(new MetadataEntry("APP14Flags0", StringUtils.shortToHexStringMM((short)m_APP14Flags0)));
		entries.add(new MetadataEntry("APP14Flags1", StringUtils.shortToHexStringMM((short)m_APP14Flags1)));
		entries.add(new MetadataEntry("ColorTransform", (m_ColorTransform <= 2)?colorTransform[m_ColorTransform]:m_ColorTransform + ""));
		
		return Collections.unmodifiableCollection(entries).iterator();
	}

	public void write(OutputStream os) throws IOException {
		ensureDataRead();
		IOUtils.writeShortMM(os, getDCTEncodeVersion());
		IOUtils.writeShortMM(os, getAPP14Flags0());
		IOUtils.writeShortMM(os, getAPP14Flags1());
		IOUtils.write(os, getColorTransform());
	}
}
