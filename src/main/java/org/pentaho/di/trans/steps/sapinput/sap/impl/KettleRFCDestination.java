/*
 * This software is provided under the terms
 * of the GNU Lesser General Public License, Version 2.1. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://www.gnu.org/licenses/lgpl-2.1.txt.
 *
 * Software distributed under the GNU Lesser Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
 * the license for the specific language governing your rights and limitations.
 *
 * */
package org.pentaho.di.trans.steps.sapinput.sap.impl;

import com.sap.conn.jco.rt.RfcDestination;

import java.util.Properties;

/**
 * @author cristhiank on 3/8/16 (calovi86 at gmail.com).
 */
public class KettleRFCDestination extends RfcDestination {

	protected KettleRFCDestination(String name, Properties properties, String propertiesProvider) {
		super( name, properties, propertiesProvider );
		// TODO Auto-generated constructor stub
	}

	public static RfcDestination getDestination(String name, Properties p) {
		return new KettleRFCDestination( name, p, "KettleRFCDestination" );
	}

}
