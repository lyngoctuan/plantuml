/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2017, Arnaud Roques
 *
 * Project Info:  http://plantuml.sourceforge.net
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * Original Author:  Arnaud Roques
 *
 * Revision $Revision: 3824 $
 *
 */
package net.sourceforge.plantuml;

/**
 * Indicates the location of a line of code within a resource.
 * The resource maybe a local file or a remote URL.
 *
 */
public interface LineLocation {
	
	/**
	 * Position of the line, starting at 0.
	 */
	public int getPosition();
	
	/**
	 * A description of the ressource.
	 * If the ressource is a file, this is the complete path of the file.
	 */
	public String getDescription();
	
	/**
	 * Get the parent of this location.
	 * If this resource has been included by a !include or !includeurl directive,
	 * this return the location of the !include line.
	 */
	public LineLocation getParent();

}