/**
 * 
 */
package source;

import java.util.ArrayList;

/**
 * @author Vinicius_B_Rosa
 *
 */
public interface INASACommandCenter {
	
	public void deployRovers(ArrayList<Rover> roverList, Environment env);
	
	public boolean runMission();
}