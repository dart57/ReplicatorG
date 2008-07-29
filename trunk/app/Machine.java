/*
  Part of the ReplicatorG project - http://www.replicat.org

  This class takes a gcode command, parses it and then does something with it.

  @author	Hoeken
  @www http://www.zachhoeken.org

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software Foundation,
  Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package processing.app;

import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;

public class Machine
{
	// our xml reader object.
	protected XMLReader xr;
	
	// the name of our machine.
	protected String name;
	
	// our driver object
	protected Driver driver;
	
	/**
	  * Creates the machine object.
	  */
	public Machine()
	{
		try{
			xr = XMLReaderFactory.createXMLReader();
		} catch (Exception e) {
			//todo: handle this.
		}
		
		loadDriver();
	}
	
	private void loadDriver()
	{
		driver = Driver.factory(name);
	}
}
