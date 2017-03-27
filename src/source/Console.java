/**
 * 
 */
package source;

import java.util.ArrayList;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Console {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Environment env = null;
		ArrayList<Rover> rovers = new ArrayList<>();
		ArrayList<Task> tasks = new ArrayList<>();
		
		env = FileReader.readFile("input.txt", rovers, tasks);
		
		NASACommandCenter commandCenter = new NASACommandCenter();
		
		commandCenter.deployRovers(rovers, env);
		commandCenter.setMission(tasks);
		
		commandCenter.runMission();
		
		System.out.println(commandCenter.printEnvironmentMap());
	}

}