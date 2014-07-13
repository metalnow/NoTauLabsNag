/**
 ******************************************************************************
 *
 * @file       FirmwareIAPObj.java
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Queries board for SN, model, revision, and sends reset command
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot_nonag.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot_nonag.uavtalk.UAVObjectManager;
import org.openpilot_nonag.uavtalk.UAVObject;
import org.openpilot_nonag.uavtalk.UAVDataObject;
import org.openpilot_nonag.uavtalk.UAVObjectField;

/**
Queries board for SN, model, revision, and sends reset command

generated from firmwareiapobj.xml
 **/
public class FirmwareIAPObj extends UAVDataObject {

	public FirmwareIAPObj() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> crcElemNames = new ArrayList<String>();
		crcElemNames.add("0");
		fields.add( new UAVObjectField("crc", "", UAVObjectField.FieldType.UINT32, crcElemNames, null) );

		List<String> CommandElemNames = new ArrayList<String>();
		CommandElemNames.add("0");
		fields.add( new UAVObjectField("Command", "", UAVObjectField.FieldType.UINT16, CommandElemNames, null) );

		List<String> BoardRevisionElemNames = new ArrayList<String>();
		BoardRevisionElemNames.add("0");
		fields.add( new UAVObjectField("BoardRevision", "", UAVObjectField.FieldType.UINT16, BoardRevisionElemNames, null) );

		List<String> DescriptionElemNames = new ArrayList<String>();
		DescriptionElemNames.add("0");
		DescriptionElemNames.add("1");
		DescriptionElemNames.add("2");
		DescriptionElemNames.add("3");
		DescriptionElemNames.add("4");
		DescriptionElemNames.add("5");
		DescriptionElemNames.add("6");
		DescriptionElemNames.add("7");
		DescriptionElemNames.add("8");
		DescriptionElemNames.add("9");
		DescriptionElemNames.add("10");
		DescriptionElemNames.add("11");
		DescriptionElemNames.add("12");
		DescriptionElemNames.add("13");
		DescriptionElemNames.add("14");
		DescriptionElemNames.add("15");
		DescriptionElemNames.add("16");
		DescriptionElemNames.add("17");
		DescriptionElemNames.add("18");
		DescriptionElemNames.add("19");
		DescriptionElemNames.add("20");
		DescriptionElemNames.add("21");
		DescriptionElemNames.add("22");
		DescriptionElemNames.add("23");
		DescriptionElemNames.add("24");
		DescriptionElemNames.add("25");
		DescriptionElemNames.add("26");
		DescriptionElemNames.add("27");
		DescriptionElemNames.add("28");
		DescriptionElemNames.add("29");
		DescriptionElemNames.add("30");
		DescriptionElemNames.add("31");
		DescriptionElemNames.add("32");
		DescriptionElemNames.add("33");
		DescriptionElemNames.add("34");
		DescriptionElemNames.add("35");
		DescriptionElemNames.add("36");
		DescriptionElemNames.add("37");
		DescriptionElemNames.add("38");
		DescriptionElemNames.add("39");
		DescriptionElemNames.add("40");
		DescriptionElemNames.add("41");
		DescriptionElemNames.add("42");
		DescriptionElemNames.add("43");
		DescriptionElemNames.add("44");
		DescriptionElemNames.add("45");
		DescriptionElemNames.add("46");
		DescriptionElemNames.add("47");
		DescriptionElemNames.add("48");
		DescriptionElemNames.add("49");
		DescriptionElemNames.add("50");
		DescriptionElemNames.add("51");
		DescriptionElemNames.add("52");
		DescriptionElemNames.add("53");
		DescriptionElemNames.add("54");
		DescriptionElemNames.add("55");
		DescriptionElemNames.add("56");
		DescriptionElemNames.add("57");
		DescriptionElemNames.add("58");
		DescriptionElemNames.add("59");
		DescriptionElemNames.add("60");
		DescriptionElemNames.add("61");
		DescriptionElemNames.add("62");
		DescriptionElemNames.add("63");
		DescriptionElemNames.add("64");
		DescriptionElemNames.add("65");
		DescriptionElemNames.add("66");
		DescriptionElemNames.add("67");
		DescriptionElemNames.add("68");
		DescriptionElemNames.add("69");
		DescriptionElemNames.add("70");
		DescriptionElemNames.add("71");
		DescriptionElemNames.add("72");
		DescriptionElemNames.add("73");
		DescriptionElemNames.add("74");
		DescriptionElemNames.add("75");
		DescriptionElemNames.add("76");
		DescriptionElemNames.add("77");
		DescriptionElemNames.add("78");
		DescriptionElemNames.add("79");
		DescriptionElemNames.add("80");
		DescriptionElemNames.add("81");
		DescriptionElemNames.add("82");
		DescriptionElemNames.add("83");
		DescriptionElemNames.add("84");
		DescriptionElemNames.add("85");
		DescriptionElemNames.add("86");
		DescriptionElemNames.add("87");
		DescriptionElemNames.add("88");
		DescriptionElemNames.add("89");
		DescriptionElemNames.add("90");
		DescriptionElemNames.add("91");
		DescriptionElemNames.add("92");
		DescriptionElemNames.add("93");
		DescriptionElemNames.add("94");
		DescriptionElemNames.add("95");
		DescriptionElemNames.add("96");
		DescriptionElemNames.add("97");
		DescriptionElemNames.add("98");
		DescriptionElemNames.add("99");
		fields.add( new UAVObjectField("Description", "", UAVObjectField.FieldType.UINT8, DescriptionElemNames, null) );

		List<String> CPUSerialElemNames = new ArrayList<String>();
		CPUSerialElemNames.add("0");
		CPUSerialElemNames.add("1");
		CPUSerialElemNames.add("2");
		CPUSerialElemNames.add("3");
		CPUSerialElemNames.add("4");
		CPUSerialElemNames.add("5");
		CPUSerialElemNames.add("6");
		CPUSerialElemNames.add("7");
		CPUSerialElemNames.add("8");
		CPUSerialElemNames.add("9");
		CPUSerialElemNames.add("10");
		CPUSerialElemNames.add("11");
		fields.add( new UAVObjectField("CPUSerial", "", UAVObjectField.FieldType.UINT8, CPUSerialElemNames, null) );

		List<String> BoardTypeElemNames = new ArrayList<String>();
		BoardTypeElemNames.add("0");
		fields.add( new UAVObjectField("BoardType", "", UAVObjectField.FieldType.UINT8, BoardTypeElemNames, null) );

		List<String> BootloaderRevisionElemNames = new ArrayList<String>();
		BootloaderRevisionElemNames.add("0");
		fields.add( new UAVObjectField("BootloaderRevision", "", UAVObjectField.FieldType.UINT8, BootloaderRevisionElemNames, null) );

		List<String> ArmResetElemNames = new ArrayList<String>();
		ArmResetElemNames.add("0");
		fields.add( new UAVObjectField("ArmReset", "", UAVObjectField.FieldType.UINT8, ArmResetElemNames, null) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
    	metadata.flags =
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_ACCESS_SHIFT |
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_GCS_ACCESS_SHIFT |
		    1 << UAVOBJ_TELEMETRY_ACKED_SHIFT |
		    1 << UAVOBJ_GCS_TELEMETRY_ACKED_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_TELEMETRY_UPDATE_MODE_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_MANUAL) << UAVOBJ_GCS_TELEMETRY_UPDATE_MODE_SHIFT|
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_MANUAL) << UAVOBJ_LOGGING_UPDATE_MODE_SHIFT;
    	metadata.flightTelemetryUpdatePeriod = 0;
    	metadata.gcsTelemetryUpdatePeriod = 0;
    	metadata.loggingUpdatePeriod = 0;
 
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			FirmwareIAPObj obj = new FirmwareIAPObj();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public FirmwareIAPObj GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (FirmwareIAPObj)(objMngr.getObject(FirmwareIAPObj.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0x8328F252l;
	protected static final String NAME = "FirmwareIAPObj";
	protected static String DESCRIPTION = "Queries board for SN, model, revision, and sends reset command";
	protected static final boolean ISSINGLEINST = 1 > 0;
	protected static final boolean ISSETTINGS = 0 > 0;
	protected static int NUMBYTES = 0;


}
